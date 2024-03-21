import java.util.Scanner;

class UserThreadPriority extends Thread {
    String k;
    char c;

    public UserThreadPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
        System.out.println("k: " + k);
        System.out.println("c: " + c);
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two thread objects with names "ThreadA" and "ThreadB"
        UserThreadPriority threadobj1 = new UserThreadPriority("ThreadA");
        UserThreadPriority threadobj2 = new UserThreadPriority("ThreadB");

        // Get a string and a character from the user
        System.out.print("Enter a string (k): ");
        String userInputString = scanner.nextLine();
        System.out.print("Enter a character (c): ");
        char userInputChar = scanner.next().charAt(0);

        // Assign the values to the thread objects
        threadobj1.k = userInputString;
        threadobj1.c = userInputChar;
        threadobj2.k = userInputString;
        threadobj2.c = userInputChar;

        // Start the threads
        threadobj1.start();
        threadobj2.start();

        // Close the scanner
        scanner.close();
    }
}
