import java.util.InputMismatchException;
import java.util.Scanner;

public class FloorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            String input = scanner.nextLine().trim();
            double number = Double.parseDouble(input);
            int result = (int) Math.floor(number);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}