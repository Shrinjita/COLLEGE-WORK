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

    Complex operator/(const Complex &other) const {
        double divisor = other.real * other.real + other.imag * other.imag;
        double newReal = (real * other.real + imag * other.imag) / divisor;
        double newImag = (imag * other.real - real * other.imag) / divisor;
        return Complex(newReal, newImag);
    }

    friend istream &operator>>(istream &in, Complex &c) {
        cout << "Enter real part: ";
        in >> c.real;
        cout << "Enter imaginary part: ";
        in >> c.imag;
        return in;
    }

    friend ostream &operator<<(ostream &out, const Complex &c) {
        out << c.real << " + " << c.imag << "i";
        return out;
    }
};

int main() {
    Complex c1(0, 0); // Initialize with default values
    Complex c2(0, 0); // Initialize with default values

    cout << "Enter values for first complex number:" << endl;
    cin >> c1;

    cout << "Enter values for second complex number:" << endl;
    cin >> c2;

    cout << "c1: " << c1 << endl;
    cout << "c2: " << c2 << endl;

    Complex sum = c1 + c2;
    Complex diff = c1 - c2;
    Complex product = c1 * c2;
    Complex quotient = c1 / c2;

    cout << "Sum: " << sum << endl;
    cout << "Difference: " << diff << endl;
    cout << "Product: " << product << endl;
    cout << "Quotient: " << quotient << endl;

    return 0;
}
