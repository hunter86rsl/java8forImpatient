package r05.r05_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryFinallyDemo {
    public static Lock myLock = new ReentrantLock();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = new Thread[2];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                try {
                    for (int k = 1; k <= 1000; k++) {
                        myLock.lock();
                        try {
                            counter++;
                            Thread.sleep(1);
                        } finally {
                            myLock.unlock();
                        }
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });
        }
        for (Thread t : threads) t.start();
        
        // Przetestuj to: (1) odkomentuj poni¿szy wiersz
        // threads[0].interrupt();
        // Uruchom program. Co siê sta³o? Dlaczego?
        // (2) Nastêpnie wykomentuj wiersze z try {, } finally {, }
        // Uruchom program. Co siê sta³o? Dlaczego?
        
        for (Thread t : threads) t.join();
        System.out.println(counter);
    }
}
