package r09.r09_02;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Stream;

public class ZipDemo {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path javaHome = Paths.get(System.getProperty("java.home"));
        Path zipFile = javaHome.getParent().resolve("src.zip");
        if (!Files.exists(zipFile)) {
            System.err.println(zipFile + " nie istnieje.");
            return;
        }

        String sourceName = "java/lang/String.java";
        Path tempDir = Files.createTempDirectory("corejava");
        Path targetPath = tempDir.resolve(sourceName);
        Files.createDirectories(targetPath.getParent());
        try (FileSystem zipfs = FileSystems.newFileSystem(zipFile, null)) {
            Files.copy(zipfs.getPath(sourceName), targetPath);
            Files.lines(targetPath).limit(40).forEach(System.out::println);
            System.out.println("\nPliki, które nie koñcz¹ siê .java:");
            try (Stream<Path> entries = Files.walk(zipfs.getPath("/"))) {
                entries.filter(p -> Files.isRegularFile(p) && !p.toString().endsWith(".java"))
                    .forEach(System.out::println);
            }            
        }

        Path zipPath = tempDir.resolve("myfile.zip");
        URI uri = new URI("jar", zipPath.toUri().toString(), null);
        // Tworzy URI jar:file://myfile.zip
        try (FileSystem zipfs = FileSystems.newFileSystem(uri,
                Collections.singletonMap("create", "true"))) {
            // Aby dodaæ pliki skopiuj je do systemu plików ZIP
            Path filePath = targetPath;            
            Files.copy(filePath, zipfs.getPath("/").resolve("String.java"));
        }
        System.out.println("Utworzony plik zip: " + zipPath);
    }
}
