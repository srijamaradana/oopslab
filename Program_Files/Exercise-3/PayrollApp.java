class Employee {
    String name;
    int empId;
    double hourlyRate;

    Employee(String name, int empId, double hourlyRate) {
        this.name = name;
        this.empId = empId;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }

    void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + empId);
    }
}

class Payroll {
    static void generatePaySlip(Employee employee, int hoursWorked) {
        double salary = employee.calculateSalary(hoursWorked);
        System.out.println("Pay Slip for " + employee.name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: $" + salary);
    }
}

public class PayrollApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Johnson", 1001, 20);
        emp1.displayInfo();
        Payroll.generatePaySlip(emp1, 40);
    }
}
