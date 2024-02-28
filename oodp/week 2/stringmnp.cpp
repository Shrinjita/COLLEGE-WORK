#include <iostream>
#include <string>
#include <locale>
class StringManipulator {
private:
    std::string userString;
public:
        void get_Str() {
        std::cout << "Enter a string: ";
        std::getline(std::cin, userString);
    }
    void print_Str() {
       std::string upperCaseStr = userString;
        for (char &c : upperCaseStr) {
            c = std::toupper(c);
        }
std::string lowerCaseStr = userString;
        for (char &c : lowerCaseStr) {
            c = std::tolower(c);
        }
        std::cout << "Uppercase: " << upperCaseStr << std::endl;
        std::cout << "Lowercase: " << lowerCaseStr << std::endl;
    }
};
int main() {
    StringManipulator strManipulator;
    strManipulator.get_Str();
    strManipulator.print_Str();
    return 0;
}
