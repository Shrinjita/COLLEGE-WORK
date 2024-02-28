#include <iostream>
using namespace std;
class DecToBin {
private:
    int decNum;
public:
    DecToBin(int num) : decNum(num) {
        cout << "Decimal Number: " << decNum << endl;
        cout << "Binary Equivalent: ";
        ConvertToBinary();
    }
DecToBin() {
        cout << "\nConversion completed." << endl;
    }
private:
    void ConvertToBinary() {
        if (decNum == 0) {
            cout << "0";
            return;
        }
        int binArr[32];
        int index = 0; 
        while (decNum > 0) {
            binArr[index++] = decNum % 2;
            decNum /= 2;
        }
        for (int i = index - 1; i >= 0; --i) {
            cout << binArr[i];
        }
    }
};
int main() {
    int decNum;
    cout << "Enter a decimal number: ";
    cin >> decNum;
    DecToBin converter(decNum);
    return 0;
}