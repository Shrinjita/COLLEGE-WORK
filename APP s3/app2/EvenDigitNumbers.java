public class EvenDigitNumbers {
    public static void main(String[] args) {
        System.out.println("Numbers between 100 and 400 with even digits: ");
                for (int i = 100; i <= 400; i++) {
            if (hasEvenDigits(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean hasEvenDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false; 
            }
            number /= 10;
        }
        return true; 
    }
}
