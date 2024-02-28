#include <iostream>
#include <cstring>
#include <cctype> 
using namespace std;
class PalindromeChecker {
private:
    char *str;
public:
    PalindromeChecker(const char *s) {
        str = new char[strlen(s) + 1];
        strcpy(str, s);
    }
    bool isPalindrome() {
        int len = strlen(str);
        for (int i = 0; i < len / 2; ++i) {
            if (tolower(str[i]) != tolower(str[len - 1 - i])) {
                return false;
            }
        }
        return true;
    }
    ~PalindromeChecker() {
        delete[] str;
    }
    bool operator()() {
        return isPalindrome();
    }
};
int main() {
    char input[100];
    cout << "Enter a string: ";
    cin.getline(input, 100);
    PalindromeChecker checker(input);
    if (checker()) {
        cout << "\"" << input << "\" is a palindrome." << endl;
    } else {
        cout << "\"" << input << "\" is not a palindrome." << endl;
    }
    return 0;
}