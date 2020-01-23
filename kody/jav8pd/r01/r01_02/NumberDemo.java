package r01.r01_02;

public class NumberDemo {
    public static void main(String[] args) {
        System.out.println(4000000000L); // liczba ca�kowita (long) 
        System.out.println(0xCAFEBABE); // liczba szesnastkowa 
        System.out.println(0b1001); // liczba dw�jkowa
        System.out.println(011); // liczba �semkowa
        
        // Podkre�lenia   
        System.out.println(1_000_000_000); 
        System.out.println(0b1111_0100_0010_0100_0000);
        
        // Zaawansowane: warto�� bez znaku
        System.out.println(Byte.toUnsignedInt((byte )-127));
        
        System.out.println(3.14F); // liczba typu float
        System.out.println(3.14); // liczba typu double 
        System.out.println(3.14D); // liczba typu double
        System.out.println(0x1.0p-3); // liczba szesnastkowa typu double

        // Warto�ci niesko�czone i NaN ('nie-liczba')
        System.out.println(1.0 / 0.0); 
        System.out.println(-1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        
        System.out.println(1.0 / 0.0 == Double.POSITIVE_INFINITY);
        System.out.println(-1.0 / 0.0 == Double.NEGATIVE_INFINITY);
        System.out.println(0.0 / 0.0 == Double.NaN);

        System.out.println(Double.isInfinite(1.0 / 0.0));
        System.out.println(Double.isNaN(0.0 / 0.0));
        System.out.println(Double.isFinite(0.0 / 0.0));
        
        // B��d zaokr�glania
        
        System.out.println(2.0 - 1.1);
        
        // Warto�ci znakowe
        
        System.out.println('J'); 
        System.out.println('J' == 74); 
        System.out.println('\u004A'); 
        System.out.println('\u263A'); 
    }
}