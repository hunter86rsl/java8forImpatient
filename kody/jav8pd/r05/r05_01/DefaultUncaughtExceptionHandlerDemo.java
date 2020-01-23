package r05.r05_01;

public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
            System.err.println(ex.getMessage());
            System.err.println("¯egnaj, okrutny œwiecie!");
        });
        System.out.println(1 / 0);
    }
}
