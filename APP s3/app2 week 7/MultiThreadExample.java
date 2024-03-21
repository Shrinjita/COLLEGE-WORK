public class MultiThreadExample {
    public static void main(String[] args) {
        // Start a user-defined thread
        Thread userThread = new Thread(new UserDefinedRunnable());
        userThread.start();

        // Sleep for 1 second in the main thread
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message from the main thread
        System.out.println("Main thread is awake after sleeping for 1 second.");
    }
}

class UserDefinedRunnable implements Runnable {
    @Override
    public void run() {
        // Sleep for 1 second in the user-defined thread
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message from the user-defined thread
        System.out.println("User-defined thread is awake after sleeping for 1 second.");
    }
}
