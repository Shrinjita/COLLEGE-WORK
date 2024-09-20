import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLuckyNumbers {
    public static BigInteger fastFibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }

        return b;
    }

    public static BigInteger computeLast10Digits(int n) {
        return fastFibonacci(777 * n).mod(BigInteger.TEN.pow(10));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            BigInteger result = computeLast10Digits(n);
            System.out.println(result);
        }

        scanner.close();
    }
}