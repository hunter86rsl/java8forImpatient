package r04.r04_04;

import java.io.UnsupportedEncodingException;
import java.util.ServiceLoader;

public class ServiceLoaderDemo {
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
        Cipher ciph = getCipher(1);
        String message = "Spotkajmy si� na dachu.";
        byte[] bytes = ciph.encrypt(message.getBytes(), new byte[] { 3 });
        String encrypted = new String(bytes, "UTF-8");
        System.out.println(encrypted);
    }
    
    public static Cipher getCipher(int minStrength) {
    	for (Cipher cipher : cipherLoader) // .rm po�rednio wywo�uje iterator
            if (cipher.strength() >= minStrength) return cipher;
        return null;
    }
}
