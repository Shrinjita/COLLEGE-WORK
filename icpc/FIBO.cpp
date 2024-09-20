#include <bits/stdc++.h>
using namespace std;

const long long MOD = 10000000000LL; // Modulo for last 10 digits

// Function to compute Pisano period for modulo m
long long pisano(long long m) {
    long long prev = 0, curr = 1;
    for (long long i = 0; i < m * m; i++) {
        long long temp = (prev + curr) % m;
        prev = curr;
        curr = temp;
        if (prev == 0 && curr == 1)
            return i + 1;
    }
    return 0;
}

// Function to compute Fibonacci number modulo m
long long fibonacciModulo(long long n, long long m) {
    long long pisanoPeriod = pisano(m);
    n = n % pisanoPeriod;

    if (n == 0) return 0;
    if (n == 1) return 1;

    long long prev = 0, curr = 1;
    for (long long i = 2; i <= n; i++) {
        long long temp = (prev + curr) % m;
        prev = curr;
        curr = temp;
    }
    return curr;
}

// Fast exponentiation to compute 777^n
long long fastExp(long long base, long long exp, long long mod) {
    long long result = 1;
    while (exp > 0) {
        if (exp % 2 == 1) result = (result * base) % mod;
        base = (base * base) % mod;
        exp /= 2;
    }
    return result;
}

int main() {
    int t;
    cin >> t;
    
    while (t--) {
        long long n;
        cin >> n;
        
        // Compute 777^n % Pisano(MOD) to reduce the Fibonacci index
        long long fibIndex = fastExp(777, n, pisano(MOD));

        // Compute the Fibonacci number at that index modulo 10^10
        long long result = fibonacciModulo(fibIndex, MOD);
        
        // Print the last 10 digits (with leading zeros if necessary)
        printf("%010lld\n", result);
    }
    
    return 0;
}
