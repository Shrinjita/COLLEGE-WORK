#include <iostream>
#include <stdexcept>
int main() {
    try {
        int num1, num2;
        std::cout << "Enter : ";
        std::cin >> num1>>num2;
        if (num2 == 0) {
            throw std::runtime_error("Division by zero is not allowed.");
        }
double result = num1 / num2;
        std::cout<<result << std::endl;
    }catch (const std::runtime_error& e) {
        std::cerr << "Error: "  << std::endl;
    }
    return 0;
}
