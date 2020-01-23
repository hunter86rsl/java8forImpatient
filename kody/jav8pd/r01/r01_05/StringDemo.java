package r01.r01_05;

import java.time.ZoneId;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String location = "Java";
        String greeting = "Witaj, " + location;
        System.out.println(greeting);
        int age = 42;
        String output = age + " lata";
        System.out.println(output);
        
        System.out.println("Za rok bêdziesz mia³  " + age + 1); // B³¹d
        System.out.println("Za rok bêdziesz mia³ " + (age + 1)); // Poprawnie
        
        String names = String.join(", ", "Piotr", "Pawe³", "Maria");
        System.out.println(names);
        
        // Klasa StringBuilder
        
        StringBuilder builder = new StringBuilder();
        for (String id : ZoneId.getAvailableZoneIds()) {
            builder.append(id);
            builder.append(", ");
        }
        String result = builder.toString();
        System.out.println(result.substring(0, 200) + "...");
        System.out.println(result.length());
        
        // Wycinanie ci¹gów znaków
        
        greeting = "Witaj, Œwiecie!";
        location = greeting.substring(7, 14);
        System.out.println(location);
        
        // Porównywanie ci¹gów znaków
        
        System.out.println(location.equals("Œwiat"));
        System.out.println(location == "Œwiat");
        System.out.println(location.equalsIgnoreCase("œwiat"));
        System.out.println("word".compareTo("œwiat"));

        // Konwersja liczb na znaki i znaków na liczby
        int n = 42;
        String str = Integer.toString(n, 2);
        System.out.println(str);
        
        n = Integer.parseInt(str);
        System.out.println(n);
        n = Integer.parseInt(str, 2);
        System.out.println(n);
        double x = Double.parseDouble("3.14"); 
        System.out.println(x);
        
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting); // zawartoœæ zmiennej greeting nie zmieni³a siê
        
        // Unicode
        String javatm = "Java\u2122";
        System.out.println(javatm);
        System.out.println(Arrays.toString(javatm.codePoints().toArray()));
        System.out.println(javatm.length());
        
        String octonions = "\ud835\udd46";
        System.out.println(octonions);
        System.out.println(Arrays.toString(octonions.codePoints().toArray()));
        System.out.println(octonions.length()); 
        // Zlicza jednostki kodowe (code units), a nie punkty kodowe (code points) z Unicode 
    }
}
