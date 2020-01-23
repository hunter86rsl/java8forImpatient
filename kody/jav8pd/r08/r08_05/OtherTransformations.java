package r08.r08_05;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OtherTransformations {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.print(title + ": ");
        if (firstElements.size() <= SIZE)
            System.out.println(firstElements);
        else {
            firstElements.remove(SIZE);
            String out = firstElements.toString();
            System.out.println(out.substring(0, out.length() - 1) + ", ...]");
        }
    }

    public static void main(String[] args) throws IOException {
        Stream<String> unikalneS�owa = Stream.of("weso�o", "weso�o", "weso�o", "delikatnie")
                .distinct();
        show("unikalneS�owa", unikalneS�owa);

        String contents = new String(Files.readAllBytes(Paths.get("zemsta.txt")),
                StandardCharsets.UTF_8);
        List<String> s�owa = Arrays.asList(contents.split("\\PL+"));
        show("s�owa", s�owa.stream());

        Stream<String> r�ne =  s�owa.stream().distinct();
        show("r�ne", r�ne);

        Stream<String> posortowane =  s�owa.stream().sorted();
        show("posortowane", posortowane);

        Stream<String> r�neSortowane =  s�owa.stream().distinct().sorted();
        show("r�neSortowane", r�neSortowane);

        Stream<String> najd�u�szeNajpierw =  s�owa.stream().sorted(Comparator.comparing(String::length).reversed());
        show("najd�u�szeNajpierw", najd�u�szeNajpierw);
        
        Object[] pot�gi = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Pobieranie " + e)).limit(20).toArray();
        System.out.println(Arrays.asList(pot�gi));
    }
}
