import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
         System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        printCalendar(year, month);

        scanner.close();
    }

    public static void printCalendar(int year, int month) {
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Get the day of the week for the first day of the month
        int startDay = getStartDay(year, month);

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(year, month);

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%5d", day);

            // Move to the next line after Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int getStartDay(int year, int month) {
        // Zeller's Congruence algorithm to find the day of the week for the first day of the month
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;
        int j = year / 100;

        int day = 1 + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) - (2 * j);
        day = (day % 7 + 7) % 7;

        return day;
    }

    public static int getDaysInMonth(int year, int month) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Check for leap year (February has 29 days)
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100 unless it's divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
