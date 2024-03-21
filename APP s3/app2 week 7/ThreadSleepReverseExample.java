public class ThreadSleepReverseExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 5; i >= 1; i--) {
                try {
                    // Sleep for 6 seconds
                    Thread.sleep(6000);
                    // Change the thread's name
                    Thread.currentThread().setName("Thread" + i);
                    // Display the current thread name
                    System.out.println("Thread name: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

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
