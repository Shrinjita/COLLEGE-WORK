#include <iostream>
using namespace std;
class Rect {
private:
    double len;
    double brd;
public:
    Rect() : len(0), brd(0) {}
    Rect(double l, double b) : len(l), brd(b) {}
    Rect(double side) : len(side), brd(side) {}
    double Area() {
        return len * brd;
    }
};
int main() {
    double len1, brd1, side2, len3, brd3;
    cout << "Enter length and breadth for rectangle 1: ";
    cin >> len1 >> brd1;
    cout << "Enter side length for rectangle 2 (square): ";
    cin >> side2;
    cout << "Enter length and breadth for rectangle 3: ";
    cin >> len3 >> brd3;
    Rect r1(len1, brd1);
    Rect r2(side2);
    Rect r3(len3, brd3);
    cout << "Area of rectangle 1: " << r1.Area() << endl;
    cout << "Area of rectangle 2 (square): " << r2.Area() << endl;
    cout << "Area of rectangle 3: " << r3.Area() << endl;
    return 0;
}