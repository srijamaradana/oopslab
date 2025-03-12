import java.util.Scanner;

class SubjectGrading {
    void calculateAverageGrade() {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0, subjectCount = 0, marks;
        char choice;

        do {
            System.out.print("Enter subject marks: ");
            marks = scanner.nextInt();
            totalMarks += marks;
            subjectCount++;

            System.out.print("Do you have more subjects? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        double average = (double) totalMarks / subjectCount;
        System.out.println("Average Marks: " + average);

        if (average >= 90)
            System.out.println("Final Grade: A");
        else if (average >= 80)
            System.out.println("Final Grade: B");
        else if (average >= 70)
            System.out.println("Final Grade: C");
        else if (average >= 60)
            System.out.println("Final Grade: D");
        else
            System.out.println("Final Grade: F");
    }
}

public class SubjectGradingApp {
    public static void main(String[] args) {
        SubjectGrading sg = new SubjectGrading();
        sg.calculateAverageGrade();
    }
}
