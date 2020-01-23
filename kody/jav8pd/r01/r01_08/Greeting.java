package r01.r01_08;

public class Greeting {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.equals("-w")) arg = "Witaj";
            else if (arg.equals("-z")) arg = "¯egnaj";
            System.out.println(arg);
        }
    }
}