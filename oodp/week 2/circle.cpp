#define _USE_MATH_DEFINES
#include <iostream>
#include <cmath>
class Circle {
private:
    double radius;
public:
    Circle(double r) {
        radius = r;
    }
        double perimeter() {
        return 2 * M_PI * radius;
    }
    double area() {
        return M_PI * radius * radius;
    }
};
int main() {
    double radius;
    std::cout << "Enter the radius of the circle: ";
    std::cin >> radius;
    Circle circle(radius);
    std::cout << "Perimeter: " << circle.perimeter() << std::endl;
    std::cout << "Area: " << circle.area() << std::endl;
    return 0;
}
