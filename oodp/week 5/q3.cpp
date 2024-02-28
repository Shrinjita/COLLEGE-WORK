#include <iostream>
using namespace std;
class Swapper {
public:
    void swap(int &a, int &b) {
        int temp = a;
        a = b;
        b = temp;
    }
};
int main() {
    Swapper swapper;
    int intA, intB;
    cout << "Enter two integer values: ";
    cin >> intA >> intB;
    swapper.swap(intA, intB);
    cout << "After swapping:" << endl;
    cout << "intA: " << intA << ", intB: " << intB << endl;
    return 0;
}
