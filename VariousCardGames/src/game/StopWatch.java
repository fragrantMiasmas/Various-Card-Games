package game;

public class StopWatch {
    
    long startTime;
    long stopTime;

    StopWatch() {

    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        stopTime = System.nanoTime();
    }

    public void reset() {
        startTime = 0;
        stopTime = 0;
    }

    public long read() {
        long runTime = stopTime - startTime;
        return (runTime);
    }

}

