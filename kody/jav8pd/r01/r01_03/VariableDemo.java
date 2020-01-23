package r01.r01_03;

import java.util.Random;

public class VariableDemo {
    public static final int DAYS_PER_YEAR = 365;
    
    enum Weekday { MON, TUE, WED, THU, FRI, SAT, SUN };
    
    public static void main(String[] args) {
        int total = 0;
        int i = 0, count;
        Random generator = new Random();
        double lotsa$ = 1000000000.0; // Poprawne, ale lepiej unikaæ
        double wysokoœæ = 0.0;
        double Ï€ = 3.141592653589793;
        String Count = "Dracula"; // Inna ni¿: "count"
        int countOfInvalidInputs = 0; // Przyk³ad zapisu camelCase
        final int DAYS_PER_WEEK = 7;
        Weekday startDay = Weekday.MON;
        // Poni¿sza linia wygeneruje b³¹d poniewa¿ nie ma zmiennej "count"
        // System.out.println(count); 
    }
}
