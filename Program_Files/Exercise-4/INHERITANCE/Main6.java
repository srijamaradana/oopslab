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

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloperDetails() {
        System.out.println("Developer skilled in " + programmingLanguage);
    }
}

class Designer extends Employee {
    private String designTool;

    public Designer(String name, double salary, String designTool) {
        super(name, salary);
        this.designTool = designTool;
    }

    public void displayDesignerDetails() {
        System.out.println("Designer skilled in " + designTool);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", 80000, "Java");
        Designer des = new Designer("Bob", 75000, "Photoshop");

        dev.displayDetails();
        dev.displayDeveloperDetails();

        des.displayDetails();
        des.displayDesignerDetails();
    }
}
