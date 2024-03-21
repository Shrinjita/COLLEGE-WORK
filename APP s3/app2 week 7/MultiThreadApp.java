import java.util.Random;

class NumberGenerator implements Runnable {
    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            int number = rand.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated Number: " + number);
            if (number % 2 == 0) {
                SecondThread.computeSquare(number);
            } else {
                ThirdThread.computeCube(number);
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread {
    public static void computeSquare(int number) {
        int square = number * number;
        System.out.println("Square: " + square);
    }
}

class ThirdThread {
    public static void computeCube(int number) {
        int cube = number * number * number;
        System.out.println("Cube: " + cube);
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator());
        t1.start();
    }
}
