import java.util.Scanner;

public class DigitCombinationsWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of combinations");
        int choice = scanner.nextInt();
        int[] digits = new int[choice];
        for (int i = 0; i < digits.length; i++) {
            System.out.println("Enter digit " + (i + 1) + ": ");
            digits[i] = scanner.nextInt();
        }

        generateCombinations(digits, new int[choice], 0);

        scanner.close();
    }

    public static void generateCombinations(int[] digits, int[] currentCombination, int index) {
        if (index == currentCombination.length) {
            printCombination(currentCombination);
            return;
        }

        for (int digit : digits) {
            currentCombination[index] = digit;
            generateCombinations(digits, currentCombination, index + 1);
        }
    }

    public static void printCombination(int[] combination) {
        for (int digit : combination) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
