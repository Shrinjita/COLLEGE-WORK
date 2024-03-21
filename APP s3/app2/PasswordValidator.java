import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password. Please follow the password criteria.");
        }
        scanner.close();
    }
    public static boolean isValidPassword(String password) {
       if (password.length() < 6 || password.length() > 16) {
            return false;
        }
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (ch == '$' || ch == '#' || ch == '@') {
                hasSpecial = true;
            }
        }
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}
