import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueValuesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];
        System.out.println("Enter 15 elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int uniqueCount = countUniqueValues(array);
        System.out.println("Number of unique values: " + uniqueCount);

        scanner.close();
    }

    public static int countUniqueValues(int[] array) {
        Set<Integer> uniqueValues = new HashSet<>();

        for (int value : array) {
            uniqueValues.add(value);
        }

        return uniqueValues.size();
    }
}
