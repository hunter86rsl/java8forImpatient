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
        List<String> s³owa = Arrays.asList(contents.split("\\PL+"));

        Optional<String> najd³u¿sze = s³owa.stream().max(String::compareToIgnoreCase);
        System.out.println("najd³u¿sze: " + najd³u¿sze.orElse(""));

        boolean s³owoZaczynaj¹ceSiêOdQ = s³owa.stream().anyMatch(s -> s.startsWith("Q"));
        System.out.println("s³owoZaczynaj¹ceSiêOdQ: " + s³owoZaczynaj¹ceSiêOdQ);

        Optional<String> zaczynaSiêOdQ = s³owa.stream().parallel().filter(s -> s.startsWith("Q")).findAny();
        System.out.println("zaczynaSiêOdQ: " + zaczynaSiêOdQ.orElse("(None)"));
            // Uruchom program jeszcze raz by sprawdziæ czy znajdzie inne s³owo
    }
}
