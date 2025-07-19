package ACLC.EmployeeSysteminBank;

public class Clerk extends Employee {
    public Clerk(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void displayDetails() {
        System.out.println();
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

