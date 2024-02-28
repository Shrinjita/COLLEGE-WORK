import java.util.Scanner;

public class CaptionGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        String caption = generateCaption(noun, verb, adjective);
        System.out.println("Your caption: " + caption);

        scanner.close();
    }

    public static String generateCaption(String noun, String verb, String adjective) {
        return "The " + adjective + " " + noun + " " + verb + "s.";
    }
}
