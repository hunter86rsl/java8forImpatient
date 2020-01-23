package r04.r04_01;

public class ConcurrentWorkerTest {
    public static void main(String[] args) {
        ConcurrentWorker worker = new ConcurrentWorker();
        worker.work();
        System.out.println("Gotowe");
    }
}
