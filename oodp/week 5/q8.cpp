#include <iostream>
#include <cstring>

using namespace std;

class StringComparator {
private:
    char *str;

public:
    StringComparator(const char *s) {
        str = new char[strlen(s) + 1];
        strcpy(str, s);
    }

    bool operator==(const StringComparator &other) const {
        return strcmp(str, other.str) == 0;
    }

    bool operator!=(const StringComparator &other) const {
        return !(*this == other);
    }

    ~StringComparator() {
        delete[] str;
    }
};

int main() {
    StringComparator str1("hello");
    StringComparator str2("world");
    StringComparator str3("hello");

    if (str1 == str2) {
        cout << "str1 is equal to str2" << endl;
    } else {
        cout << "str1 is not equal to str2" << endl;
    }

    if (str1 == str3) {
        cout << "str1 is equal to str3" << endl;
    } else {
        cout << "str1 is not equal to str3" << endl;
    }

    return 0;
}
