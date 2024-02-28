#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int number, originalNumber, sum = 0, digitCount = 0;

    cout << "Enter an integer number: ";
    cin >> number;

    originalNumber = number;

    // Count the number of digits
    while (number != 0) {
        number /= 10;
        ++digitCount;
    }

    number = originalNumber; // Reset to the original number

    // Calculate the sum of digits raised to the power of digitCount
    while (number != 0) {
        int digit = number % 10;
        sum += pow(digit, digitCount);
        number /= 10;
    }

    if (sum == originalNumber) {
        cout << originalNumber << " is an Armstrong number." << endl;
    } else {
        cout << originalNumber << " is not an Armstrong number." << endl;
    }

    return 0;
}
