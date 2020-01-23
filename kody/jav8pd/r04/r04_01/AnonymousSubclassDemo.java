package r04.r04_01;

import java.util.ArrayList;

public class AnonymousSubclassDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(100) {
            public void add(int index, String element) {
                super.add(index, element);
                System.out.printf("Dodanie %s na pozycji %d\n", element, index);
            }
        };
        
        names.add(0, "Piotr");
        names.add(1, "Pawe³");
        names.add(0, "Maria");
        System.out.println(names);
        
        invite(new ArrayList<String>() {{ add("Henryk"); add("Sabina"); }});
    }
    
    public static void invite(ArrayList<String> friends) {
        System.out.println("Lista goœci: " + friends);
    }
}
