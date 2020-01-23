package r07.r07_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> weekdays = new HashMap<>();
        initialize(weekdays);
        System.out.println(weekdays);
        
        weekdays = new TreeMap<>();
        initialize(weekdays);
        System.out.println(weekdays);
        
        weekdays = new LinkedHashMap<>();
        initialize(weekdays);
        System.out.println(weekdays);
    }
    
    public static void initialize(Map<String, Integer> weekdays) {
        weekdays.put("Poniedzia�ek", 1);
        weekdays.put("Wtorek", 2);
        weekdays.put("�roda", 3);
        weekdays.put("Czwartek", 4);
        weekdays.put("Pi�tek", 5);
        weekdays.put("Sobota", 6);
        weekdays.put("Niedziela", 7);
    }
}
