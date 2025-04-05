interface Person {
    void speak();
}

class Student {
    void study() {
        System.out.println("Student studies");
    }
}

class CollegeStudent extends Student implements Person {
    public void speak() {
        System.out.println("CollegeStudent speaks");
    }
}

public class Hybrid5 {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.speak();
    }
}
