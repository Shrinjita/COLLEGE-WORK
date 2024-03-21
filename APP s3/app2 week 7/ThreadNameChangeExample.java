public class ThreadNameChangeExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                // Sleep for 5 seconds
                Thread.sleep(5000);
                // Change the thread's name
                Thread.currentThread().setName("NewThreadName");
                // Display the new thread name
                System.out.println("Thread name changed to: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Display the initial thread name
        System.out.println("Initial thread name: " + thread.getName());

        // Start the thread
        thread.start();

        try {
            // Wait for the thread to finish
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
