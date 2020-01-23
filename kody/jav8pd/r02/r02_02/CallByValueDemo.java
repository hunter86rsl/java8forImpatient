package r02.r02_02;

public class CallByValueDemo {
    public static void main(String[] args) {
        EvilManager boss = new EvilManager();
        
        Employee fred = new Employee("Fred", 50000);
        System.out.println("Wynagrodzenie pocz�tkowo: " + fred.getSalary());            
        boss.giveRandomRaise(fred);
        System.out.println("Wynagrodzenie po podwy�ce: " + fred.getSalary());

        double sales = 100000;
        System.out.println("Sprzeda� pocz�tkowo: " + sales);
        boss.increaseRandomly(sales);
        System.out.println("Sprzeda� po zwi�kszeniu: " + sales);
        
        System.out.println("Pracownik pocz�tkowo: " + fred.getName());            
        boss.replaceWithZombie(fred);
        System.out.println("Pracownik po zmianie: " + fred.getName());            
    }
}
