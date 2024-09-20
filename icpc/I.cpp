#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> reconstruct_array(vector<int> products) {
    int n = products.size() + 1;
    unordered_map<int, int> prime_factors;

    // Preprocessing
    for (int product : products) {
        for (int p = 2; p * p <= product; p++) {
            while (product % p == 0) {
                prime_factors[p]++;
                product /= p;
            }
        }
        if (product > 1) {
            prime_factors[product]++;
        }
    }

    // Reconstruction
    vector<int> A;
    for (int product : products) {
        for (auto& [p, count] : prime_factors) {
            if (count > 0) {
                if (find(A.begin(), A.end(), p) != A.end()) {
                    int index = find(A.begin(), A.end(), p) - A.begin();
                    if (A[index] % p == 0) {
                        A[index] /= p;
                    }
                } else {
                    bool found = false;
                    for (int i = 0; i < A.size(); i++) {
                        if (A[i] % p == 0) {
                            A[i] /= p;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        A.push_back(p);
                    }
                }
                count--;
            }
        }
    }

    // Validation
    for (int i = 0; i < n - 1; i++) {
        if (A[i] * A[i + 1] != products[i]) {
            return {}; // No valid reconstruction found
        }
    }

    return A;
}

int main() {
    int n;
    cin >> n;

    vector<int> products(n - 1);
    for (int i = 0; i < n - 1; i++) {
        cin >> products[i];
    }

    vector<int> A = reconstruct_array(products);

    if (A.empty()) {
        cout << "No" << endl;
    } else {
        cout << "Yes" << endl;
        for (int a : A) {
            cout << a << " ";
        }
        cout << endl;
    }

    return 0;
}