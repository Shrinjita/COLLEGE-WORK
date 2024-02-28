#include <iostream>
class AddDistance {
private:
    int feet;
    int inches;
public:
        AddDistance(int ft, int in) {
        feet = ft;
        inches = in;
        normalize(); }
    void normalize() {
        feet += inches / 12;
        inches %= 12;
    }
    void display() {
        std::cout << "Distance: " << feet << " feet " << inches << " inches" << std::endl;
    }
    AddDistance add(const AddDistance& other) {
        int totalFeet = feet + other.feet;
        int totalInches = inches + other.inches;

        return AddDistance(totalFeet, totalInches);
    }
};

int main() {
    int feet1, inches1, feet2, inches2;

    std::cout << "Enter the first distance:" << std::endl;
    std::cout << "Feet: ";
    std::cin >> feet1;
    std::cout << "Inches: ";
    std::cin >> inches1;

    std::cout << "Enter the second distance:" << std::endl;
    std::cout << "Feet: ";
    std::cin >> feet2;
    std::cout << "Inches: ";
    std::cin >> inches2;

    AddDistance distance1(feet1, inches1);
    AddDistance distance2(feet2, inches2);

    AddDistance sum = distance1.add(distance2);

    std::cout << "Sum of distances:" << std::endl;
    sum.display();

    return 0;
}
