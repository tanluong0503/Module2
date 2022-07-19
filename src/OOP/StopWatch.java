package OOP;

public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        long elapsed;
        elapsed = (endTime - startTime);
        return elapsed;
    }

    public static class TestWatch {
        public static void main(String[] args) {
            StopWatch watch = new StopWatch();
            System.out.printf("Start: %d\n", watch.getStartTime());
            watch.stop();
            System.out.printf("End: %d\n", watch.getEndTime());
            System.out.printf("Elapsed Time: %d ", watch.getElapsedTime());
        }
    }


}
