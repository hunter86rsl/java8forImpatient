package r07.r07_03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> badWords = new HashSet<>();
        badWords.add("sex");
        badWords.add("drugs");
        badWords.add("c++");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Wybierz nazwê u¿ytkownika: ");
        String username = in.next();        
        if (badWords.contains(username.toLowerCase()))
            System.out.println("Wybierz inn¹ nazwê");
        else
            System.out.println("Przyjêto " + username + " poniewa¿ nie nale¿y do " + badWords);
        
        TreeSet<String> countries = new TreeSet<>((u, v) ->
            u.equals(v) ? 0
            : u.equals("USA") ? -1
            : v.equals("USA") ? 1
            : u.compareTo(v));
        
        countries.add("Bahrain");
        countries.add("Australia");
        countries.add("USA");
        countries.add("Canada");
        System.out.println(countries);
    }
}
