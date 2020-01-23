package r06.r06_05;

import java.util.ArrayList;

public class WordListDemo {
    public static void main(String[] args) {
        WordList words = new WordList();
        ArrayList<String> strings = words; // Konwersja do klasy nadrzêdnej
        strings.add("Hello");
        strings.add("C++");
        System.out.println(words);
    }
}
