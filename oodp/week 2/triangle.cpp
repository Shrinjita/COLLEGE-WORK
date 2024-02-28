#include <iostream>
#include <cmath>
class Triangle {
private:
    double side1;
    double side2;
    double side3;
public:
        Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
double calculatePerimeter() {
        return side1 + side2 + side3;
    }
 double calculateArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
};
int main() {
    double side1 = 3.0;
    double side2 = 4.0;
    double side3 = 5.0;
    Triangle triangle(side1, side2, side3);
    double perimeter = triangle.calculatePerimeter();
    double area = triangle.calculateArea();
    std::cout << "Triangle sides: " << side1 << ", " << side2 << ", " << side3 << std::endl;
    std::cout << "Perimeter: " << perimeter << " units" << std::endl;
    std::cout << "Area: " << area << " square units" << std::endl;
    return 0;
}
