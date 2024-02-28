#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<int> nums(2 * n);
        for (int i = 0; i < 2 * n; ++i) {
            cin >> nums[i];
        }

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < 2 * n; ++i) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount == oddCount) {
            cout << "Yes" << endl;
        } else {
            cout << "No" << endl;
        }
    }

    return 0;
}
