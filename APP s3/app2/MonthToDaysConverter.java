import java.util.Scanner;

public class MonthToDaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a month name: ");
        String monthName = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity
        
        int days = convertMonthToDays(monthName);
        
        if (days > 0) {
            System.out.println(monthName + " has " + days + " days.");
        } else {
            System.out.println("Invalid month name. Please enter a valid month.");
        }
        
        scanner.close();
    }
    
    public static int convertMonthToDays(String monthName) {
        switch (monthName) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28; // Assuming a non-leap year
            default:
                return -1; // Invalid month name
        }
    }
}
