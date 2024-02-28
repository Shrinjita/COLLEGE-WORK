#include <iostream>
#include <cmath>
using namespace std;
class Shape {
public:
    virtual double area() const = 0;
};
class Square : public Shape {
private:
    double side;
public:
    Square(double s) : side(s) {}
    double area() const override {
        return side * side;
    }
};
class Rectangle : public Shape {
private:
    double length;
    double width;
public:
    Rectangle(double l, double w) : length(l), width(w) {}
    double area() const override {
        return length * width;
    }
};
class Circle : public Shape {
private:
    double radius;
public:
    Circle(double r) : radius(r) {}
    double area() const override {
        return M_PI * radius * radius;
    }
};
class Triangle : public Shape {
private:
    double base;
    double height;
public:
    Triangle(double b, double h) : base(b), height(h) {}
    double area() const override {
        return 0.5 * base * height;
    }
};
int main() {
    double side, length, width, radius, base, height;
    cout << "Enter the side of the square: ";
    cin >> side;
    Square square(side);
    cout << "Enter the length and width of the rectangle: ";
    cin >> length >> width;
    Rectangle rectangle(length, width);
    cout << "Enter the radius of the circle: ";
    cin >> radius;
   Circle circle(radius);
    cout << "Enter the base and height of the triangle: ";
    cin >> base >> height;
    Triangle triangle(base, height);
    cout << "Area of square: " << square.area() << endl;
    cout << "Area of rectangle: " << rectangle.area() << endl;
    cout << "Area of circle: " << circle.area() << endl;
    cout << "Area of triangle: " << triangle.area() << endl;
    return 0;
}