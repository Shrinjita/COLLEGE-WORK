#include <iostream>
using namespace std;
class Bank {
private:
    int amt;
public:
    Bank() : amt(300) {}
    Bank(int addAmt) : amt(300 + addAmt) {}
    int GetAmt() {
        return amt;
    }
};
int main() {
    int addAmt;
    cout << "Enter amount to add: ";
    cin >> addAmt;
    Bank b1;
    Bank b2(addAmt);
    cout << "Initial Amount : Rs " << b1.GetAmt() << endl;
    cout << "Final Amount : Rs " << b2.GetAmt() << endl;
    return 0;
}