import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AbsentDigitsInMobileNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        Set<Character> absentDigits = findAbsentDigits(mobileNumber);

        if (absentDigits.isEmpty()) {
            System.out.println("All digits are present in the mobile number.");
        } else {
            System.out.print("Absent digits in the mobile number: ");
            for (char digit : absentDigits) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static Set<Character> findAbsentDigits(String mobileNumber) {
        Set<Character> allDigits = new HashSet<>();
        Set<Character> absentDigits = new HashSet<>();

        for (char digit = '0'; digit <= '9'; digit++) {
            allDigits.add(digit);
        }

        for (char c : mobileNumber.toCharArray()) {
            if (Character.isDigit(c)) {
                allDigits.remove(c);
            }
        }

        absentDigits.addAll(allDigits);
        return absentDigits;
    }
}
