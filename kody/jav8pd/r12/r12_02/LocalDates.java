package r12.r12_02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Todayâ€™s date
        System.out.println("dziœ: " + today);

        LocalDate alonzosBirthday = LocalDate.of(1903, 6, 14);
        alonzosBirthday = LocalDate.of(1903, Month.JUNE, 14);
        // Wykorzystuje typ wyliczeniowy Month 
        System.out.println("urodzinyAlonzo: " + alonzosBirthday);

        LocalDate programmersDay = LocalDate.of(2014, 1, 1).plusDays(255);
        // 13. wrzeœnia, ale w roku przestêpnym 12. wrzeœnia
        System.out.println("dzieñProgramisty: " + programmersDay);

        LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
        LocalDate christmas = LocalDate.of(2014, Month.DECEMBER, 25);

        System.out.println("Do Bo¿ego Narodzenia: " + independenceDay.until(christmas));
        System.out.println("Do Bo¿ego Narodzenia: " + independenceDay.until(christmas, ChronoUnit.DAYS));

        System.out.println(LocalDate.of(2016, 1, 31).plusMonths(1));
        System.out.println(LocalDate.of(2016, 3, 31).minusMonths(1));

        DayOfWeek startOfLastMillennium = LocalDate.of(1900, 1, 1).getDayOfWeek();
        System.out.println("pocz¹tekZesz³egoWieku: " + startOfLastMillennium);
        System.out.println(startOfLastMillennium.getValue());
        System.out.println(DayOfWeek.SATURDAY.plus(3));
    }
}
