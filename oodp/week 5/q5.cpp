#include <iostream>
#include <cmath>
using namespace std;
class VolumeCalculator {
public:
    int calculateVolume(int side) {
        return side * side * side;
    }
    double calculateVolume(double radius, double height) {
        return M_PI * radius * radius * height;
    }
    double calculateVolume(double radius) {
        return 4.0 / 3.0 * M_PI * radius * radius * radius;
    }
};
int main() {
    VolumeCalculator calculator;
    double side;
    cout << "Enter the side length of the cube: ";
    cin >> side;
    cout << "Volume of the cube: " << calculator.calculateVolume(side) << endl;
    double radius, height;
    cout << "Enter the radius and height of the cylinder: ";
    cin >> radius >> height;
    cout << "Volume of the cylinder: " << calculator.calculateVolume(radius, height) << endl;
    cout << "Enter the radius of the sphere: ";
    cin >> radius;
    cout << "Volume of the sphere: " << calculator.calculateVolume(radius) << endl;
    return 0;
}