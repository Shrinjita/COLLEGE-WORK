#include <iostream>
class Average {
public:
    static void calculateAndPrintAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        std::cout << "Average: " << average << std::endl;
    }
};
int main() {
    double num1, num2, num3;
    std::cout << "Enter three numbers: ";
    std::cin >> num1 >> num2 >> num3;
    Average::calculateAndPrintAverage(num1, num2, num3);
    return 0;
}
