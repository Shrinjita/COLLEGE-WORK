#include <iostream>

using namespace std;

class DivisibleByNine {
private:
    int start;
    int end;
    int sum;
    int count;

public:
    DivisibleByNine(int s, int e) : start(s), end(e), sum(0), count(0) {
        cout << "Numbers divisible by 9 between " << start << " and " << end << ":\n";
        FindAndSumDivisibleNumbers();
    }

    ~DivisibleByNine() {
        cout << "\nDivisibility check completed." << endl;
    }

private:
    void FindAndSumDivisibleNumbers() {
        for (int i = start; i <= end; ++i) {
            if (i % 9 == 0) {
                cout << i << " ";
                sum += i;
                ++count;
            }
        }
        cout << "\n\nTotal count: " << count << endl;
        cout << "Sum of the numbers: " << sum << endl;
    }
};

int main() {
    int startNum = 100;
    int endNum = 200;

    DivisibleByNine checker(startNum, endNum);

    return 0;
}
