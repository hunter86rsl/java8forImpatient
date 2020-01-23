package r09.r09_01;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//Patrz https://pl.wikipedia.org/wiki/Windows_Bitmap

public class MemoryMappedFileDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("chart.bmp");
        try (FileChannel channel = FileChannel.open(path,
                StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE,
                    0, channel.size());
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            int size = buffer.getInt(2);
            int headerSize = buffer.getInt(14);
            int width = buffer.getInt(18);
            int height = buffer.getInt(22);
            short planes = buffer.getShort(26);
            short depth = buffer.getShort(28);
            int compressionMode = buffer.getInt(30);;
            System.out.println("Rozmiar: " + size);
            System.out.println("Rozmiar nag³ówka: " + headerSize);
            System.out.println("Szerokoœæ: " + width);
            System.out.println("Wysokoœæ: " + height);
            System.out.println("Palety: " + planes);
            System.out.println("Kolory: " + depth);
            System.out.println("Tryb kompresji: " + compressionMode);
           
        }
    }
}
