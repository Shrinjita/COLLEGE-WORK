class MyThread extends Thread {
    private long sleepTimeInNs;

    public MyThread(long sleepTimeInNs) {
        this.sleepTimeInNs = sleepTimeInNs;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + getName() + " is sleeping for " + sleepTimeInNs + " nanoseconds.");
            Thread.sleep(0, (int) sleepTimeInNs); // Sleep for the specified nanoseconds
            System.out.println("Thread " + getName() + " woke up.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadSleepExample {
    public static void main(String[] args) {
        long[] sleepTimesInNs = {10, 20, 50, 70, 100};

        for (int i = 0; i < sleepTimesInNs.length; i++) {
            MyThread thread = new MyThread(sleepTimesInNs[i]);
            thread.start();
        }
    }
}
