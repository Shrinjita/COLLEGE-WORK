#include <iostream>
using namespace std;
int main() {
    int num;
    cout<<"Enter number : ";
    cin>>num;
    cout << "Initial value of num: " << num << '\n';
    cout << "Pre-increment num: " << ++num << '\n';
    cout << "After pre-increment, num: " << num << '\n';
    cout << "Post-increment num: " << num++ << '\n';
    cout << "After post-increment, num: " << num << '\n';
    cout << "Pre-decrement num: " << --num << '\n';
    cout << "After pre-decrement, num: " << num << '\n';
    cout << "Post-decrement num: " << num-- << '\n';
    cout << "After post-decrement, num: " << num << '\n';
    return 0;
}
