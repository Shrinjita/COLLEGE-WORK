#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class PalindromeChecker {
public:
    bool isPalindrome(int num) {
        string str = to_string(num);
        return isPalindrome(str);
    }

    bool isPalindrome(double num) {
        string str = to_string(num);
        return isPalindrome(str);
    }

    bool isPalindrome(string str) {
        string original = str;
        reverse(str.begin(), str.end());
        return original == str;
    }
};

int main() {
    PalindromeChecker checker;

    int intNum;
    cout << "Enter an integer: ";
    cin >> intNum;
    if (checker.isPalindrome(intNum)) {
        cout << intNum << " is a palindrome." << endl;
    } else {
        cout << intNum << " is not a palindrome." << endl;
    }

    double doubleNum;
    cout << "Enter a double: ";
    cin >> doubleNum;
    if (checker.isPalindrome(doubleNum)) {
        cout << doubleNum << " is a palindrome." << endl;
    } else {
        cout << doubleNum << " is not a palindrome." << endl;
    }

    string str;
    cout << "Enter a string: ";
    cin >> str;
    if (checker.isPalindrome(str)) {
        cout << "\"" << str << "\" is a palindrome." << endl;
    } else {
        cout << "\"" << str << "\" is not a palindrome." << endl;
    }

    return 0;
}
