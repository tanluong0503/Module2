package Multi;

public class SingleTaskMultipleThreads extends Thread {
    public void run() {
        System.out.println("Executing task");
    }

    public static void main(String[] args) {
        SingleTaskMultipleThreads t1 = new SingleTaskMultipleThreads();
        SingleTaskMultipleThreads t2 = new SingleTaskMultipleThreads();
        SingleTaskMultipleThreads t3 = new SingleTaskMultipleThreads();

        t1.start();
        t2.start();
        t3.start();
    }
}
