#include <iostream>
using namespace std;
class FloydTri {
private:
    int rows;
public:
    FloydTri(int r) : rows(r) {
        cout << "Floyd's Triangle with " << rows << " rows:" << endl;
        PrintTri();
    }
private:
    void PrintTri() {
        int n = 1;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                cout << n << " ";
                ++n;
            }
            cout << endl;
        }
    }
};
int main() {
    int r;
    cout << "Enter the number of rows for Floyd's Triangle: ";
    cin >> r;
    FloydTri triangle(r);
    return 0;
}
