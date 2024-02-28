#include <iostream>
using namespace std;

int main() {
    double num1, num2;
    cout << "Enter the first number: ";
    cin >> num1;
    cout << "Enter the second number: ";
    cin >> num2;
    cout << "Before swapping: num1 = " << num1 << ", num2 = " << num2 << '\n';
    double temp = num1;
    num1 = num2;
    num2 = temp;
    cout << "After swapping: num1 = " << num1 << ", num2 = " << num2 << '\n';
    return 0;
}
