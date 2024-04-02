import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {
    private Map<String, String> passwords;

    public PasswordManager() {
        passwords = new HashMap<>();
    }

    public void addPassword(String account, String password) {
        passwords.put(account, password);
        System.out.println("Password added for account: " + account);
    }

    public String getPassword(String account) {
        return passwords.get(account);
    }

    public void deletePassword(String account) {
        if (passwords.containsKey(account)) {
            passwords.remove(account);
            System.out.println("Password deleted for account: " + account);
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordManager passwordManager = new PasswordManager();

        while (true) {
            System.out.println("\n1. Add Password");
            System.out.println("2. Get Password");
            System.out.println("3. Delete Password");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the account: ");
                    String accountToAdd = scanner.nextLine();
                    System.out.print("Enter the password: ");
                    String passwordToAdd = scanner.nextLine();
                    passwordManager.addPassword(accountToAdd, passwordToAdd);
                    break;
                case 2:
                    System.out.print("Enter the account: ");
                    String accountToGet = scanner.nextLine();
                    String retrievedPassword = passwordManager.getPassword(accountToGet);
                    if (retrievedPassword != null) {
                        System.out.println("Password for account " + accountToGet + ": " + retrievedPassword);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the account: ");
                    String accountToDelete = scanner.nextLine();
                    passwordManager.deletePassword(accountToDelete);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
