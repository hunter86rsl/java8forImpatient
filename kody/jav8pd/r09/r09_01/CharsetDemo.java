package r09.r09_01;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharsetDemo {
    public static void main(String[] args) {
        System.out.println("Domyœlny zestaw znaków na tym komputerze: " + Charset.defaultCharset());
        System.out.println("Zestawy znaków dostêpne w JVM: " + Charset.availableCharsets().keySet());
        
        String str = "Java\u2122";
        System.out.println(str);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        showBytes(bytes);
            // Zauwa¿, ¿ê oznaczenie marki chronionej zajmuje trzy bajty
        showBytes(str.getBytes(StandardCharsets.UTF_16));
            // Zauwa¿ znacznik kolejnoœci bajtów
        showBytes(str.getBytes(StandardCharsets.ISO_8859_1));
            // Znak TM nie mo¿e byæ zakodowany i jest zastêpowany znakiem ?
        
        System.out.println(new String(bytes, Charset.forName("windows-1252")));
            // Sk¹d wiesz, ¿e to z³e kodowanie? Jak mo¿e to stwierdziæ program?
    }
    
    public static void showBytes(byte[] bytes) {
        for (byte b : bytes) System.out.printf("%2X ", b);
        System.out.println();
    }
}
