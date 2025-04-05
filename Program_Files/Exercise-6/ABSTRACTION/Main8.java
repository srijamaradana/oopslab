abstract class OnlineCourse {
    abstract void platformDetails();
}

class Udemy extends OnlineCourse {
        void platformDetails() {
        System.out.println("Udemy offers affordable courses for all skill levels.");
    }
}

class Coursera extends OnlineCourse {
        void platformDetails() {
        System.out.println("Coursera provides university-certified courses.");
    }
}

public class Main8 {
    public static void main(String[] args) {
        OnlineCourse o1 = new Udemy();
        OnlineCourse o2 = new Coursera();
        o1.platformDetails();
        o2.platformDetails();
    }
}
