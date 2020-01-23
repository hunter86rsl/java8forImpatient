package r07.r07_04;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Alicja", 1); // Dodaje par� klucz-warto�� do mapy
        counts.put("Alicja", 2); // Aktualizuje warto�� klucza
        
        int count = counts.get("Alicja");
        System.out.println(count);
        count = counts.getOrDefault("Bogdan", 0);
        System.out.println(count);
        
        String word = "Feliks";
        counts.merge(word, 1, Integer::sum);
        counts.merge(word, 1, Integer::sum);
        System.out.println(counts.get(word));

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            process(key, value);
        }
        
        counts.forEach((k, v) -> process(k, v));
    }
    
    public static void process(String key, Integer value) {
        System.out.printf("Przetwarza klucz %s i warto�� %d\n", key, value);
    }
        
}
