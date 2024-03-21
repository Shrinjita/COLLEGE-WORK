public class DivisibleBy8AndMultipleOf5 {
    public static void main(String[] args) {
        // Define the range
        int lowerLimit = 1000;
        int upperLimit = 2000;

        System.out.println("Numbers between " + lowerLimit + " and " + upperLimit + " that are divisible by 8 and multiples of 5 are:");

        // Iterate through the range
        for (int i = lowerLimit; i <= upperLimit; i++) {
            // Check if the number is divisible by 8 and a multiple of 5
            if (i % 8 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
