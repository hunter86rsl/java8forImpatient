package r05.r05_01;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StackTraceDemo {
    public static void bad() {
        System.out.println(1 / 0);
    }
    
    public static void main(String[] args) {
        try {
            bad();
        } catch (Exception ex) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ex.printStackTrace(new PrintStream(out));
            String description = out.toString();
            System.out.println("Œlad stosu w ci¹gu znaków: " + description.replaceAll("\\s+",  " "));
        }
        
        try {
            bad();
        } catch (Exception ex) {
            StackTraceElement[] frames = ex.getStackTrace();
            for (StackTraceElement frame : frames)
                System.out.println("Ramka: " + frame);
        }
    }

}
