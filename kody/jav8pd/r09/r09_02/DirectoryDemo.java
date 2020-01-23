package r09.r09_02;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.stream.Stream;

public class DirectoryDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(System.getProperty("java.home"));
        System.out.printf("Katalogi wewn�trz %s:\n", path);
        try (Stream<Path> entries = Files.list(path)) {
            entries.forEach(System.out::println);
        }
        
        System.out.printf("\nKatalogi i podkatalogi wewn�trz %s:\n", path);
        try (Stream<Path> entries = Files.walk(path)) {
            System.out.printf("%d plik�w\n", entries.count());
        }
        
        // Kopia drzewa katalog�w
        
        Path source = path;
        Path target = Files.createTempDirectory("corejava").resolve("jre");
        Files.walk(source).forEach(p -> {
            try {
                Path q = target.resolve(source.relativize(p));
                if (Files.isDirectory(p)) {
                    System.out.printf("Tworzenie %s\n", q);
                    Files.createDirectory(q);
                }
                else {
                    System.out.printf("Kopiowanie %s do %s\n", p, q);
                    Files.copy(p, q);
                }
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        });
        
        // Kasowanie kopi
                
        Path root = target;
        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            public FileVisitResult visitFile(Path file,
                    BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                System.out.printf("Kasowanie %s\n", file);                
                return FileVisitResult.CONTINUE;
            }
            public FileVisitResult postVisitDirectory(Path dir,
                    IOException ex) throws IOException {
                if (ex != null) throw ex;
                Files.delete(dir);
                System.out.printf("Removing %s\n", dir);
                return FileVisitResult.CONTINUE;
            }
        });        
    }
}