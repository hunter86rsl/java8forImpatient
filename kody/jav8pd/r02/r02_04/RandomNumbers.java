package r02.r02_04;

import java.util.Random;

public class RandomNumbers {
    private static Random generator = new Random();
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
            // Mo¿liwy dostêp do statycznej zmiennej generator
    }
}