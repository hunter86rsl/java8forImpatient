package r01.r01_09;

import java.util.Scanner;

public class StaticMethodDemo {
    public static double average(double x, double y) {
        double sum = x + y;
        return sum / 2;
    }
    
    public static void main(String[] args) {
        System.out.print("Wpisz dwie liczby: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double result = average(a, b);
        System.out.println("Œrednia: " + result);
    }
}