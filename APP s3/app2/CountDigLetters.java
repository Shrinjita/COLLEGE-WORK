import java.util.Scanner;

public class CountDigLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int letterCount = 0;
        int digitCount = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letterCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits: " + digitCount);
        scanner.close();
    }
}
