package r05.r05_01;

import java.util.Random;

public class ThrowDemo {
    private static Random generator = new Random();

    public static int randInt(int low, int high) {
        if (low > high)
            throw new IllegalArgumentException(
                "low powinno byæ <= high ale low jest równe "
                + low + " a high jest równe " + high);

        return low + Math.abs(generator.nextInt()) % (high - low + 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Generowanie liczby losowej...");
        int r = randInt(10, 20);
        System.out.println("r = " + r);
        System.out.println("I kolejnej...");
        r = randInt(10, 5);
        System.out.println("r = " + r);
    }
}
