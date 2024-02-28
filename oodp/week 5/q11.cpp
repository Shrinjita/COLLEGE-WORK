#include <iostream>

using namespace std;

class Rational {
private:
    int numerator;
    int denominator;

public:
    Rational(int num, int den) : numerator(num), denominator(den) {}

    Rational operator+(const Rational &other) const {
        int newNum = numerator * other.denominator + other.numerator * denominator;
        int newDen = denominator * other.denominator;
        return Rational(newNum, newDen);
    }

    Rational operator-(const Rational &other) const {
        int newNum = numerator * other.denominator - other.numerator * denominator;
        int newDen = denominator * other.denominator;
        return Rational(newNum, newDen);
    }

    Rational operator*(const Rational &other) const {
        int newNum = numerator * other.numerator;
        int newDen = denominator * other.denominator;
        return Rational(newNum, newDen);
    }

    Rational operator/(const Rational &other) const {
        int newNum = numerator * other.denominator;
        int newDen = denominator * other.numerator;
        return Rational(newNum, newDen);
    }

    void display() {
        cout << numerator << "/" << denominator << endl;
    }
};

int main() {
    int num1, den1, num2, den2;

    cout << "Enter numerator and denominator for the first rational number: ";
    cin >> num1 >> den1;

    cout << "Enter numerator and denominator for the second rational number: ";
    cin >> num2 >> den2;

    Rational r1(num1, den1);
    Rational r2(num2, den2);

    cout << "r1: ";
    r1.display();

    cout << "r2: ";
    r2.display();

    Rational sum = r1 + r2;
    Rational diff = r1 - r2;
    Rational product = r1 * r2;
    Rational quotient = r1 / r2;

    cout << "Sum: ";
    sum.display();

    cout << "Difference: ";
    diff.display();

    cout << "Product: ";
    product.display();

    cout << "Quotient: ";
    quotient.display();

    return 0;
}
