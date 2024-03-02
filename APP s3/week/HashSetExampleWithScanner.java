import java.util.HashSet;
import java.util.Scanner;

public class HashSetExampleWithScanner {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fruit names (type 'done' to finish): ");
        String input;
        while (!(input = scanner.next()).equalsIgnoreCase("done")) {
            fruits.add(input);
        }

        System.out.print("Enter a fruit to search: ");
        String searchFruit = scanner.next();
        System.out.println("Contains '" + searchFruit + "': " + fruits.contains(searchFruit));

        scanner.close();
    }
}
