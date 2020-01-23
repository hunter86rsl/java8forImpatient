package r13.r13_06;

import java.text.MessageFormat;
import java.time.Instant;
import java.util.Date;

public class MessageFormatDemo {
    public static void main(String[] args) {
        String message = MessageFormat.format("Teraz jest godzina {0,time,short}.", Date.from(Instant.now()));
        System.out.println(message);
        
        String template = "Skopiowano {0,choice,0#0 plików|1#1 plik|2#{0} pliki|5{0} plików}";
        System.out.println(MessageFormat.format(template, 0));
        System.out.println(MessageFormat.format(template, 1));
        System.out.println(MessageFormat.format(template, 42));
        System.out.println(MessageFormat.format(template, -1)); // Pierwsze ograniczenie jest ignorowane!
    }

}
