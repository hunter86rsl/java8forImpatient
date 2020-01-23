package r08.r08_08;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class CollectingResults {
    public static Stream<String> noVowels(String filename) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(filename)),
                StandardCharsets.UTF_8);
        List<String> wordList = Arrays.asList(contents.split("\\PL+"));
        Stream<String> words = wordList.stream();
        return words.map(s -> s.replaceAll("[aeiouAEIOU]", ""));
    }

    public static <T> void show(String label, Set<T> set) {
        System.out.print(label + ": " + set.getClass().getName());
        System.out.println("["
                + set.stream().limit(10).map(Object::toString).collect(Collectors.joining(", "))
                + "]");
    }

    public static void main(String[] args) throws IOException {
        Iterator<Integer> iter = Stream.iterate(0, n -> n + 1).limit(10).iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        Object[] numbers = Stream.iterate(0, n -> n + 1).limit(10).toArray();
        System.out.println(numbers); // Zauwa¿, ¿e jest to tablica Object[] 

        try {
            Integer number = (Integer) numbers[0]; // OK
            System.out.println("number: " + number);
            Integer[] numbers2 = (Integer[]) numbers; // Wyrzuca wyj¹tek
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

        Integer[] numbers3 = Stream.iterate(0, n -> n + 1).limit(10).toArray(Integer[]::new);
        System.out.println(numbers3); // Zauwa¿, ¿e jest to tablica Integer[]

        HashSet<String> noVowelHashSet = noVowels("zemsta.txt").collect(HashSet::new, HashSet::add,
                HashSet::addAll);
        show("noVowelHashSet", noVowelHashSet);

        Set<String> noVowelSet = noVowels("zemsta.txt").collect(Collectors.toSet());
        show("noVowelSet", noVowelSet);

        TreeSet<String> noVowelTreeSet = noVowels("zemsta.txt").collect(
                Collectors.toCollection(TreeSet::new));
        show("noVowelTreeSet", noVowelTreeSet);

        String result = noVowels("zemsta.txt").limit(10).collect(Collectors.joining());
        System.out.println(result);
        result = noVowels("zemsta.txt").limit(10).collect(Collectors.joining(", "));
        System.out.println(result);

        IntSummaryStatistics summary = noVowels("zemsta.txt").collect(
                Collectors.summarizingInt(String::length));
        double averageWordLength = summary.getAverage();
        double maxWordLength = summary.getMax();
        System.out.println("Œrednia d³ugoœæ s³owa: " + averageWordLength);
        System.out.println("Maksymalna d³ugoœæ s³owa: " + maxWordLength);

        noVowels("zemsta.txt").limit(10).forEach(System.out::println);
    }
}
