package r11.r11_05;

/*
Wykonaj takie polecenia:

javac com/horstmann/annotations/ToStringAnnotationProcessor.java
javac -processor com.horstmann.annotations.ToStringAnnotationProcessor r11/r11_05/*.java
java r11.r11_05.SourceLevelAnnotationDemo
    
*/

public class SourceLevelAnnotationDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(10, 10), 20, 30);
        System.out.println(com.horstmann.annotations.ToStrings.toString(rect));
    }
}
