package r07.r07_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties settings = new Properties();
        settings.put("szerokosc", "200");
        settings.put("tytul", "Witaj, swiecie!");
        Path path = Paths.get("demo.properties");
        try (OutputStream out = Files.newOutputStream(path)) {
            settings.store(out, "Ustawienia programu");
        }
        
        settings = new Properties();
        try (InputStream in = Files.newInputStream(path)) {
            settings.load(in);
        }
        System.out.println(settings);
        
        String title = settings.getProperty("tytul", "Nowy dokument");
        String height = settings.getProperty("wysokosc", "100");
        System.out.println(title);
        System.out.println(height);
        System.out.println();
        System.out.println("Wlasciwosci systemu");
        Properties sysprops = System.getProperties();
        sysprops.forEach((k, v) -> System.out.printf("%s=%s\n", k, v));
    }
}
