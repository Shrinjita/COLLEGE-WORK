import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text/string: ");
        String text = scanner.nextLine();

        Map<Character, Integer> characterCountMap = countCharacters(text);

        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println("Character: '" + entry.getKey() + "' Count: " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<Character, Integer> countCharacters(String text) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
            }
        }

        return characterCountMap;
    }
}
