#include <iostream>
using namespace std;

unsigned long long calculateFactorial(int number) {
    if (number == 0 || number == 1) {
        return 1;
    } else {
        return number * calculateFactorial(number - 1);
    }
}

int main() {
    int number;

    cout << "Enter a non-negative integer: ";
    cin >> number;

    if (number < 0) {
        cout << "Factorial is not defined for negative numbers." << endl;
    } else {
        unsigned long long factorial = calculateFactorial(number);
        cout << "Factorial of " << number << " is: " << factorial << endl;
    }

    return 0;
}
