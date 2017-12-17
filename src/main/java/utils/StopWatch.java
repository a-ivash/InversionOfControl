package utils;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public double getSeconds() {
        if (startTime > endTime) return 0;
        return (endTime - startTime) / 10e9;
    }

    public double getMilliseconds() {
        if (startTime > endTime) return 0;
        return (endTime - startTime) / 10e6;
    }

}
