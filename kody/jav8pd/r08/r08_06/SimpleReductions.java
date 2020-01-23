package r08.r08_06;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class SimpleReductions {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("zemsta.txt")),
                StandardCharsets.UTF_8);
        List<String> s�owa = Arrays.asList(contents.split("\\PL+"));

        Optional<String> najd�u�sze = s�owa.stream().max(String::compareToIgnoreCase);
        System.out.println("najd�u�sze: " + najd�u�sze.orElse(""));

        boolean s�owoZaczynaj�ceSi�OdQ = s�owa.stream().anyMatch(s -> s.startsWith("Q"));
        System.out.println("s�owoZaczynaj�ceSi�OdQ: " + s�owoZaczynaj�ceSi�OdQ);

        Optional<String> zaczynaSi�OdQ = s�owa.stream().parallel().filter(s -> s.startsWith("Q")).findAny();
        System.out.println("zaczynaSi�OdQ: " + zaczynaSi�OdQ.orElse("(None)"));
            // Uruchom program jeszcze raz by sprawdzi� czy znajdzie inne s�owo
    }
}
