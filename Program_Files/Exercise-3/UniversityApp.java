import java.util.ArrayList;

class Department {
    String name;
    ArrayList<String> courses = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("Courses Offered: " + courses);
    }
}

class Faculty {
    String name;
    String department;

    Faculty(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Faculty: " + name + ", Department: " + department);
    }
}

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Department csDept = new Department("Computer Science");
        csDept.addCourse("Java");
        csDept.addCourse("Data Structures");

        Faculty prof = new Faculty("Dr. Brown", "Computer Science");
        Student student = new Student("Alice", 101);

        csDept.displayDetails();
        prof.displayInfo();
        student.displayInfo();
    }
}
