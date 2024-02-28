import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> createArray(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> result = createArray(n);

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i));
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
