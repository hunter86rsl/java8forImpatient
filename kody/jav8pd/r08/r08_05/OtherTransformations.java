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
        Stream<String> unikalneS這wa = Stream.of("weso這", "weso這", "weso這", "delikatnie")
                .distinct();
        show("unikalneS這wa", unikalneS這wa);

        String contents = new String(Files.readAllBytes(Paths.get("zemsta.txt")),
                StandardCharsets.UTF_8);
        List<String> s這wa = Arrays.asList(contents.split("\\PL+"));
        show("s這wa", s這wa.stream());

        Stream<String> r騜ne =  s這wa.stream().distinct();
        show("r騜ne", r騜ne);

        Stream<String> posortowane =  s這wa.stream().sorted();
        show("posortowane", posortowane);

        Stream<String> r騜neSortowane =  s這wa.stream().distinct().sorted();
        show("r騜neSortowane", r騜neSortowane);

        Stream<String> najd逝窺zeNajpierw =  s這wa.stream().sorted(Comparator.comparing(String::length).reversed());
        show("najd逝窺zeNajpierw", najd逝窺zeNajpierw);
        
        Object[] pot璕i = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Pobieranie " + e)).limit(20).toArray();
        System.out.println(Arrays.asList(pot璕i));
    }
}
