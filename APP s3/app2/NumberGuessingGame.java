import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(9) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean correctGuess = false;
        System.out.println("Welcome to the Number Guessing Game!");
        while (!correctGuess) {
            System.out.print("Guess a number between 1 and 9: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) 
            {
                System.out.println("Well guessed! The number was " + randomNumber);
                correctGuess = true;
            } 
            else 
            {
                System.out.println("Try again. Incorrect guess.");
            }
        }
        scanner.close();
    }
}
