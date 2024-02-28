#include <iostream>

using namespace std;

class NumberPyramid {
private:
    int height;

public:
    NumberPyramid(int h) : height(h) {
        cout << "Pyramid pattern with height " << height << ":\n";
        PrintPattern();
    }
private:
    void PrintPattern() {
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                cout << i << " ";
            }
            cout << endl;
        }
    }
};

int main() {
    int pyramidHeight;
    cout << "Enter the height of the pyramid: ";
    cin >> pyramidHeight;

    NumberPyramid pyramid(pyramidHeight);

    return 0;
}
