package r02.r02_04;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {
    private static final ArrayList<Integer> expirationYear = new ArrayList<>();
    static {
        // Dodanie kolejnych dwudziestu lat do tablicy
        int year = LocalDate.now().getYear();
        for (int i = year; i <= year + 20; i++) {
            expirationYear.add(i);
        }   
    }
    // ...
}
