package r01.r01_07;

import java.util.*;

public class DoDemo {
   public static void main(String[] args) {
      Random generator = new Random();      
      int target = 5;
      int count = 1;
      int next;
      do {
         next = generator.nextInt(10);
         count++;
      } while (next != target);
         
      System.out.println("Po " + count + " iteracjach pojawi�a si� warto�� " + target);
   }
}
