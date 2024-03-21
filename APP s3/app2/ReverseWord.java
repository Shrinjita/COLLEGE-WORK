import java.util.Scanner;
public class ReverseWord 
{public static void main(String[] args) 
    {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String reversedWord = reverseString(word);
        System.out.println("Reversed word: " + reversedWord);
        scanner.close();
    }
 public static String reverseString(String str) 
    {char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end)
        {char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
