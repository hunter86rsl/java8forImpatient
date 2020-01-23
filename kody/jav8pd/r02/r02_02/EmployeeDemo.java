package r02.r02_02;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee fred = new Employee("Fred", 50000);
        fred.raiseSalary(10);
        System.out.println(fred.getName());
        System.out.println(fred.getSalary());
    }
}
