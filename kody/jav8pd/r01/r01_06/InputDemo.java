package r01.r01_06;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jak siê nazywasz?");
        String name = in.nextLine();
        System.out.println("Ile masz lat?");
        if (in.hasNextInt()) {
            int age = in.nextInt();
            System.out.printf("Witaj %s. Za rok bêdziesz mia³ %d lat.\n", name, age + 1);
        } else {
            System.out.printf("Witaj %s. Nie masz jeszcze pe³nego roku?", name);
        }
    }
}
