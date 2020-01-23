package r02.r02_01;

import java.util.ArrayList;

public class ReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
            // Lista friends jest pusta
        friends.add("Piotr");
            // Lista friends ma rozmiar 1
        ArrayList<String> people = friends;
            // Teraz zmienne people i friends wskazuj¹ na ten sam obiekt
        people.add("Pawe³");
        System.out.println(friends);
    }
}
