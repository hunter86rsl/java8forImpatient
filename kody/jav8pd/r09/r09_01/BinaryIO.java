package r09.r09_01;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Patrz https://pl.wikipedia.org/wiki/Windows_Bitmap

public class BinaryIO {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("chart.bmp");
        try (InputStream inStream = Files.newInputStream(path)) {            
            DataInput in = new DataInputStream(inStream);
            byte[] header = new byte[2];
            in.readFully(header);
            int size = swap(in.readInt());
            in.readInt();
            in.readInt();
            int headerSize = swap(in.readInt());
            int width = swap(in.readInt());
            int height = swap(in.readInt());
            short planes = swap(in.readShort());
            short depth = swap(in.readShort());
            int compressionMode = swap(in.readInt());;
            System.out.println("Nag³ówek: " + new String(header, StandardCharsets.US_ASCII));
            System.out.println("Rozmiar: " + size);
            System.out.println("Rozmiar nag³ówka: " + headerSize);
            System.out.println("Szerokoœæ: " + width);
            System.out.println("Wysokoœæ: " + height);
            System.out.println("Palety: " + planes);
            System.out.println("Kolory: " + depth);
            System.out.println("Tryb kompresji: " + compressionMode);
        }
    }
    
    public static int swap(int n) {
        return (n & 0xFF000000) >> 24 | (n & 0xFF0000) >> 8 | (n & 0xFF00) << 8 | (n & 0xFF) << 24; 
    }

    public static short swap(short n) {
        return (short) ((n & 0xFF00) >> 8 | (n & 0xFF) << 8); 
    }
    
}
