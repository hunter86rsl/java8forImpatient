package r02.r02_03;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee james = new Employee("James Bond", 500000);
            // wywo³uje konstruktor Employee(String, double) 
        Employee anonymous = new Employee("", 40000);
            // wywo³uje konstruktor Employee(double) 
        Employee unpaid = new Employee("Igor Intern");
        Employee e = new Employee();
            // konstruktor bez argumentów
    }
}
