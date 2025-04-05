class Student {
    String name;
    int age;
    String course;
    Student() {
        name = "John Doe";
        age = 20;
        course = "Computer Science";
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayInfo();
    }
}
