#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <algorithm>
#define KEY 12345

using namespace std;

class Product {
protected:
    string name;
    double price;
    int stock;

public:
    Product(const string& nam, double pri,int sto) {
        name=nam;
        price=pri;
        stock=sto;
    }

    virtual double calculateTotalCost(int quantity) const {
        return quantity * price;
    }

    virtual void display() const {
        cout << "Product: " << name << " | Price: $" << price << " | Stock: " << stock <<endl;
    }

    virtual void save(ostream& os) const {
        os << "Product " << name << " " << price << " " << stock << endl;
    }

    static Product* load(istream& is) {
        string name;
        double price;
        int stock;
        is >> name >> price >> stock;
        return new Product(name, price, stock);
    }

    string getName() const {
        return name;
    }
    
    int getStock() const {
        return stock;
    }

    bool sell(int quantity) {
        if(stock>=quantity){
            stock-=quantity;
            return true;
        }
        return false;
    }

    void setStock(int stk){
        stock=stk;
    }

    double getPrice(){
        return price;
    }
};

template <typename T>
class Inventory {
private:
    vector<T*> items;

public:
    void addItem(T* item){
        items.push_back(item);
    }

    void displayItems() const{
        for (const auto& item : items){
            item->display();
        }
    }

    void saveToFile(const string& filename) const{
        ofstream file(filename);
        if (file.is_open()) {
            for (const auto& item : items) {
                item->save(file);
            }
            file.close();
        }
    }

   void loadFromFile(const string& filename ){
        ifstream file(filename);
        if (file.is_open()) {
            string itemType;
            while (file >> itemType) {
                    addItem(Product::load(file));
                }
            file.close();
        };
    }

    T* getProductByName(const string& prod){
        for(const auto& item : items){
            if(item->getName()==prod){
                return item;
            }
        }
        return nullptr;
    }
    void update(const string& prod,int stk){
        T* item =getProductByName(prod);
        item->setStock(stk);
    }
};

template <typename U>
class Cart{
private:
    vector<U*> items;

public:

    double calculateTotalCost() const {
        double totalCost = 0.0;
        for (const auto& item : items) {
                totalCost+=item->getPrice();
        }
        return totalCost;
    }

    void displayItems() const {
        for (const auto& item : items) {
            item->display();
        }
    }

    void addItem(U* item){
        items.push_back(item);
    }

    void delItem(U* item){
        auto it = find(items.begin(), items.end(), item);
        if(it!=items.end()){
            items.erase(it);
        }
        displayItems();
    }
    
    void complete(){
        cout << "Your total is: " << calculateTotalCost() << endl;
        for (const auto& item : items) {
            item->sell(1);
        }
        cout << "Items sold successfully" << endl;
    }
};

void menu(){
    cout << "1.Display stock" << endl;
    cout << "2.Add item to cart" << endl;
    cout << "3.Delete item from cart" << endl;
    cout << "4.Display cart" << endl;
    cout << "5.Cart total" << endl;
    cout << "6.Finish purchase" << endl;
    cout << "7.Quit" << endl;
    cout << "Enter your choice" << endl;
}

void staffmenu(){
    cout << "1.Display stock" << endl;
    cout << "2.Update stock" << endl;
    cout << "3.Add stock" << endl;
    cout << "4.Quit" << endl;
    cout << "Enter your choice" << endl;
}

int main() {
    Inventory<Product> productContainer;
    Cart<Product> cart;
    bool staff=false;
    productContainer.loadFromFile("products.txt");
    string resp;
    cout << "Are you a customer or employee? {'customer','employee'}" << endl;
    cin >> resp;
    if(resp=="employee"){
        int key;
        cout << "Enter your key: ";
        cin >> key;
        if(key==KEY){
            staff=true;
        }
        else{
            cout << "Key is incorrect, defaulting to customer" << endl;
        }
    }
    bool run=true;
    while(run==true){
        if(!staff){
            int choice=0;
            menu();
            cin >> choice;
            switch(choice) {
                case 1:{
                    productContainer.displayItems();
                    break;
                }
                case 2:{
                    string prod;
                    cout << "Enter name of product" << endl;
                    cin >> prod;  
                    cart.addItem(productContainer.getProductByName(prod));
                    break;
                }
                case 3:{
                    string prod;
                    cout << "Enter name of product" << endl;
                    cin >> prod;  
                    cart.delItem(productContainer.getProductByName(prod));
                    break;
                }
                case 4:{
                    cart.displayItems();
                    break;
                }
                case 5:{
                    cout<< "Total cost is: " << cart.calculateTotalCost() << endl;
                    break;
                }
                case 6:{
                    cart.complete();
                    run=false;
                    break;
                }
                case 7:{
                    run=false;
                    break;
                }
                default:{
                    cout << "Invalid choice" << endl;
                    break;
                }
            }
        }
        else{
            int choice=0;
            staffmenu();
            cin >> choice;
            switch(choice) {
                case 1:{
                    productContainer.displayItems();
                    break;
                }
                case 2:{
                    string prod;
                    int stock;
                    cout << "Enter name of product to update" << endl;
                    cin >> prod;
                    cout << "Enter new stock amount" << endl;
                    cin >> stock;
                    productContainer.update(prod,stock);
                    productContainer.displayItems();
                    break;
                }
                case 3:{
                    string prod;
                    int stock;
                    double price;
                    cout << "Enter name of product" << endl;
                    cin >> prod;
                    cout << "Enter price" << endl;
                    cin >> price;
                    cout << "Enter stock amount" << endl;
                    cin >> stock;
                    productContainer.addItem(new Product(prod,price,stock));
                    break;
                }
                case 4:{
                    run=false;
                    break;
                }
                default:{
                    cout << "Invalid choice" << endl;
                    break;
                }
            }
        }
    }

    productContainer.saveToFile("products.txt");

return 0;
}