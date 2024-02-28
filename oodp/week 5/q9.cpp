#include <iostream>

using namespace std;

class Complex {
private:
    double real;
    double imag;

public:
    Complex(double r, double i) : real(r), imag(i) {}

    Complex operator+(const Complex &other) const {
        return Complex(real + other.real, imag + other.imag);
    }

    Complex operator-(const Complex &other) const {
        return Complex(real - other.real, imag - other.imag);
    }

    Complex operator*(const Complex &other) const {
        double newReal = real * other.real - imag * other.imag;
        double newImag = real * other.imag + imag * other.real;
        return Complex(newReal, newImag);
    }

    friend ostream &operator<<(ostream &out, const Complex &c) {
        out << c.real << " + " << c.imag << "i";
        return out;
    }
};

int main() {
    Complex c1(2.0, 3.0);
    Complex c2(1.0, 2.0);

    Complex sum = c1 + c2;
    Complex diff = c1 - c2;
    Complex product = c1 * c2;

    cout << "c1: " << c1 << endl;
    cout << "c2: " << c2 << endl;
    cout << "Sum: " << sum << endl;
    cout << "Difference: " << diff << endl;
    cout << "Product: " << product << endl;

    return 0;
}
