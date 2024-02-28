#include <iostream>

using namespace std;

class Swapper {
private:
    int value;

public:
    Swapper(int val) : value(val) {}

    void display() {
        cout << "Value: " << value << endl;
    }

    Swapper operator^(Swapper &other) {
        int temp = value;
        value = other.value;
        other.value = temp;
        return *this;
    }
};

int main() {
    Swapper a(5);
    Swapper b(10);

    cout << "Before swapping:" << endl;
    a.display();
    b.display();

    a ^ b;

    cout << "After swapping:" << endl;
    a.display();
    b.display();

    return 0;
}
