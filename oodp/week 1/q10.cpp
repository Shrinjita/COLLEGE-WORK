#include <iostream>
using namespace std;

int main() {
    int number, originalNumber, sum = 0;

    cout << "Enter an integer number: ";
    cin >> number;

    originalNumber = number;

    while (number != 0) {
        int digit = number % 10;
        sum += digit;
        number /= 10;
    }

    cout << "The sum of the digits of " << originalNumber << " is: " << sum << endl;

    return 0;
}
