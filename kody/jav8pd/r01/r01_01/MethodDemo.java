package r01.r01_01;

import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Witaj, �wiecie!");
        System.out.println("Witaj, �wiecie!".length());
        System.out.println(new Random().nextInt());

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}