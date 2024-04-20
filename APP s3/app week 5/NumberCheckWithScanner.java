import java.util.Scanner;

public class NumberCheckWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        boolean result = checkNumbers(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static boolean checkNumbers(int a, int b) {
        return a == b || a + b == 5 || Math.abs(a - b) == 5;
    }
}
