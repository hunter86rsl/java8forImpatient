package r04.r04_01;

public class InheritanceDemo {
    public static void main(String[] args) {
        Manager boss = new Manager("Fred", 200000);
        boss.setBonus(10000); // Zdefiniowana w klasie podrzêdnej
        System.out.println(boss.getSalary());
        boss.raiseSalary(5); // Odziedziczona z klasy nadrzêdnej
        System.out.println(boss.getSalary());        
        Employee empl = boss; // Ok, konwersja do klasy nadrzêdnej
        empl.raiseSalary(5); // Nadal mo¿e wykonywaæ metody klasy nadrzêdnej
        System.out.println(empl.getSalary()); // Wywo³uje Manager.getSalary
        
        if (empl instanceof Manager) {
            Manager mgr = (Manager) empl;
            mgr.setBonus(20000);
        }
    }
}