
public class ThreadExample {
    public static void main(String[] args) {
        String k = "Hello123World456";

        Counter counter = new Counter(k);

        Thread threadA = new Thread(() -> {
            int dc = counter.countDigits();
            System.out.println("ThreadA:" + dc);
        });

        Thread threadB = new Thread(() -> {
            int cc = counter.countAlphabeticChars();
            System.out.println("ThreadB:" + cc);
        });

        threadA.start();
        threadB.start();
    }
}
