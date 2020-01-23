package r06.r06_04;

import java.util.function.Predicate;

public class Arrays {
    public static <T> void printAll(T[] elements, Predicate<? super T> filter) {
        for (T e : elements) 
            if (filter.test(e))
                System.out.println(e.toString());
    }
}
