package r01.r01_08;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[10];
        for (int i = 0; i < names.length / 2; i++) {
            names[i] = "";
        }
        names[0] = "Fred";
        names[1] = names[0];
        System.out.println("names="+Arrays.toString(names));
        
        int[] primes = { 17, 19, 23, 29, 31 };
        primes = new int[] { 2, 3, 5, 7, 11, 13 };
        
        // Rozszerzona pêtla for
        int sum = 0;
        for (int n : primes) {
            sum += n;
        }
        
        System.out.println("sum=" +sum);
        
        // Przypisywanie zmiennych tablicowych i kopiowanie
        int[] numbers = primes;
        numbers[5] = 42; // Zmienia równie¿ wartoœæ w tablicy primes
        System.out.println("primes=" + Arrays.toString(primes));
        
        primes[5] = 13;
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
        copiedPrimes[5] = 31; // Nie zmienia wartoœci w tablicy primes
        System.out.println("primes=" + Arrays.toString(primes));
        System.out.println("copiedPrimes=" + Arrays.toString(copiedPrimes));
    }
}
