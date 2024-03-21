class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running. Iteration " + i);
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread1", Thread.MAX_PRIORITY);
        MyThread thread2 = new MyThread("Thread2", Thread.NORM_PRIORITY);
        MyThread thread3 = new MyThread("Thread3", Thread.MIN_PRIORITY);
        MyThread thread4 = new MyThread("Thread4", Thread.NORM_PRIORITY);
        MyThread thread5 = new MyThread("Thread5", Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
