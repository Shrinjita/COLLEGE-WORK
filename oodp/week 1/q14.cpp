#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;

    cout << "Enter a positive integer: ";
    cin >> n;

    if (n < 1) {
        cout << "Please enter a positive integer." << endl;
    } else {
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }

        cout << "Sum of natural numbers from 1 to " << n << " is: " << sum << endl;
    }

    return 0;
}
