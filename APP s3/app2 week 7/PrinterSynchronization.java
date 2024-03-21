import java.util.concurrent.Semaphore;

class Printer {
    private Semaphore semaphore = new Semaphore(1);

    public void print(String jobName) {
        try {
            semaphore.acquire();
            System.out.println("Printing: " + jobName);
            Thread.sleep(1000); // Simulate printing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

class PrintJob implements Runnable {
    private Printer printer;
    private String jobName;

    public PrintJob(Printer printer, String jobName) {
        this.printer = printer;
        this.jobName = jobName;
    }

    @Override
    public void run() {
        printer.print(jobName);
    }
}

public class PrinterSynchronization {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread job1 = new Thread(new PrintJob(printer, "Job 1"));
        Thread job2 = new Thread(new PrintJob(printer, "Job 2"));
        Thread job3 = new Thread(new PrintJob(printer, "Job 3"));

        job1.start();
        job2.start();
        job3.start();

        try {
            job1.join();
            job2.join();
            job3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
