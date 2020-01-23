package r07.r07_05;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackQueueDemo {
    public static void main(String[] args) {
    	ArrayDeque<String> stos = new ArrayDeque<>();
    	stos.push("Piotr");
    	stos.push("Pawe³");
    	stos.push("Maria");
    	while (!stos.isEmpty())
    	    System.out.println(stos.pop());
        
        System.out.println();
        
        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add("Piotr");
        kolejka.add("Pawe³");
        kolejka.add("Maria");
        while (!kolejka.isEmpty())
        System.out.println(kolejka.remove());
        
    }
}
