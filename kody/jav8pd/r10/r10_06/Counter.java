package r10.r10_06;

public class Counter {
    private int value;
    public synchronized int increment() {
        value++;
        return value;
    }
}