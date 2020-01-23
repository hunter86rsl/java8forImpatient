package r02.r02_04;

import java.text.NumberFormat;

public class StaticMethodDemo {
    public static void main(String[] args) {
        int dieToss = RandomNumbers.nextInt(1, 6); 
        System.out.println(dieToss);
        
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // Wy�wietli 0,1 z�
        System.out.println(percentFormatter.format(x)); // Wy�wietli 10%
    }
}
