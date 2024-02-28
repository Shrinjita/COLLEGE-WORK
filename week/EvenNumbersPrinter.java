import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbersPrinter {
    
    public static void printEvenNumbers(List<Integer> numbers) {
        System.out.println("Even numbers in the list:");
        for (Integer number : numbers) {
            System.out.println(number % 2 == 0?number:continue);
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        System.out.println("Enter a list of numbers (enter a non-integer value to stop):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numberList.add(number);
        }

        printEvenNumbers(numberList);

        scanner.close();
    }
}
