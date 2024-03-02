import java.util.Scanner;

public class PalindromeCheckerIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindromeIgnoreCase(input);
        System.out.println("Is palindrome (ignoring case)? " + isPalindrome);

        scanner.close();
    }

    public static boolean isPalindromeIgnoreCase(String str) {
        str = str.toLowerCase();  // Convert the input string to lowercase
        
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

