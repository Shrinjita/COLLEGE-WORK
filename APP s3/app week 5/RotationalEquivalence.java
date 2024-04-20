import java.util.Scanner;

public class RotationalEquivalence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();

        boolean areEquivalent = areRotationallyEquivalent(str1, str2);
        System.out.println("Are two strings Rotationally equal? : " + areEquivalent);

        scanner.close();
    }

    public static boolean areRotationallyEquivalent(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself to handle rotation
        String concatenatedStr1 = str1 + str1;

        return concatenatedStr1.contains(str2);
    }
}
