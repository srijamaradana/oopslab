import java.util.Scanner;

class MultipleStudentsGrading {
    void assignGrades() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        while (true) {
            System.out.print("Enter student marks: ");
            int marks = scanner.nextInt();

            if (marks >= 90)
                System.out.println("Grade: A");
            else if (marks >= 80)
                System.out.println("Grade: B");
            else if (marks >= 70)
                System.out.println("Grade: C");
            else if (marks >= 60)
                System.out.println("Grade: D");
            else
                System.out.println("Grade: F");

            System.out.print("Do you want to enter another student’s marks? (y/n): ");
            choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N')
                break;
        }
    }
}

public class MultiStudentGradeApp {
    public static void main(String[] args) {
        MultipleStudentsGrading msg = new MultipleStudentsGrading();
        msg.assignGrades();
    }
}
