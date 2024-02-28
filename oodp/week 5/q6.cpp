#include <iostream>
using namespace std;
int sumOfDivisors(int num) {
    int sum = 1;  // Start with 1 as 1 is always a divisor
    for (int i = 2; i <= num / 2; ++i) {
        if (num % i == 0) {
            sum += i;
        }
    }
    return sum;
}
int main() {
    int num1, num2;
    cin >> num1 >> num2;
    if (sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1) {
        cout << "Friendly Pair" << endl;
    } else {
        cout << "Not a Friendly Pair" << endl;
    }
    return 0;
}
