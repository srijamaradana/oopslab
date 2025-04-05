abstract class Course {
    abstract void courseDuration();
}

class ComputerScience extends Course {
       void courseDuration() {
        System.out.println("Computer Science course is 4 years long.");
    }
}

class BusinessManagement extends Course {
       void courseDuration() {
        System.out.println("Business Management course is 3 years long.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Course c1 = new ComputerScience();
        Course c2 = new BusinessManagement();
        c1.courseDuration();
        c2.courseDuration();
    }
}
