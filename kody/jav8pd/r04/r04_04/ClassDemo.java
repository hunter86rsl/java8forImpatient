package r04.r04_04;

public class ClassDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        Object obj = System.out;
        Class<?> cl = obj.getClass();
        
        System.out.println("Ten obiekt jest instancj¹ " + cl.getName());

        String className = "java.util.Scanner";
        cl = Class.forName(className);
            // Obiekt opisuj¹cy klasê java.util.Scanner
        cl = java.util.Scanner.class;
        System.out.println(cl.getName());
        Class<?> cl2 = String[].class; // Opisuje tablicê typu String[]
        System.out.println(cl2.getName());
        System.out.println(cl2.getCanonicalName());
        Class<?> cl3 = Runnable.class; // Opisuje interfejs Runnable 
        System.out.println(cl3.getName());
        Class<?> cl4 = int.class; // Opisuje typ int 
        System.out.println(cl4.getName());
        Class<?> cl5 = void.class; // Opisuje typ void 
        System.out.println(cl5.getName());
    }
}
