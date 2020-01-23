package r08.r08_01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String tre�� = new String(Files.readAllBytes(Paths.get("zemsta.txt")),
                StandardCharsets.UTF_8);
        List<String> s�owa = Arrays.asList(tre��.split("\\PL+"));

        long licznik = 0;
        for (String s : s�owa) {
            if (s.length() > 12)
                licznik++;
        }
        System.out.println(licznik);

        licznik = s�owa.stream().filter(w -> w.length() > 12).count();
        System.out.println(licznik);

        licznik = s�owa.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(licznik);
    }
}
