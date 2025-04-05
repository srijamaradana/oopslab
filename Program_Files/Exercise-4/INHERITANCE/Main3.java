class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayManagerDetails() {
        System.out.println("Manager of " + department + " Department.");
    }
}

class Executive extends Manager {
    private String companyCar;

    public Executive(String name, double salary, String department, String companyCar) {
        super(name, salary, department);
        this.companyCar = companyCar;
    }

    public void displayExecutiveDetails() {
        System.out.println("Executive with company car: " + companyCar);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Executive exec = new Executive("John", 120000, "Marketing", "Tesla");
        exec.displayDetails();
        exec.displayManagerDetails();
        exec.displayExecutiveDetails();
    }
}
