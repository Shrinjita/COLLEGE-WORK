#include <iostream>

using namespace std;

class CubePrinter {
private:
    int limit;

public:
    CubePrinter(int num) : limit(num) {
        cout << "Cubes of numbers up to " << limit << ":" << endl;
        PrintCubes();
    }

    ~CubePrinter() {
        cout << "\nCube printing completed." << endl;
    }

private:
    void PrintCubes() {
        for (int i = 1; i <= limit; ++i) {
            cout << "Cube of " << i << " is: " << i * i * i << endl;
        }
    }
};

int main() {
    int num;
    cout << "Enter an integer to display cubes up to: ";
    cin >> num;

    CubePrinter cubePrinter(num);

    return 0;
}
