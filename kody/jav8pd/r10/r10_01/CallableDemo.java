package r10.r10_01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CallableDemo {
    public static long occurrences(String word, Path path) {
        try {
            String zawarto�� = new String(Files.readAllBytes(path),
                StandardCharsets.UTF_8);
            return Pattern.compile("\\PL+")
                    .splitAsStream(zawarto��)
                    .filter(Predicate.isEqual(word))
                    .count();
        } catch (IOException ex) {
            return 0;
        }
    }
    
    public static Set<Path> descendants(Path p) throws IOException {        
        try (Stream<Path> entries = Files.walk(p)) {
            return entries.collect(Collectors.toSet());
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        String word = "String";
        Set<Path> �cie�ki = descendants(Paths.get("."));
        List<Callable<Long>> zadania = new ArrayList<>();
        for (Path p : �cie�ki) zadania.add(
            () -> { return occurrences(word, p); });
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processors);
        List<Future<Long>> wyniki = executor.invokeAll(zadania);
        long suma = 0;
        for (Future<Long> wynik : wyniki) suma += wynik.get();
        System.out.println("Wyst�pie� s�owa String: " + suma);
        
        String searchWord = "occurrences";
        List<Callable<Path>> searchTasks = new ArrayList<>();
        for (Path p : �cie�ki) searchTasks.add(
            () -> { if (occurrences(searchWord, p) > 0) return p; else throw new RuntimeException(); });
        Path found = executor.invokeAny(searchTasks);
        System.out.println(found);
    }
}
