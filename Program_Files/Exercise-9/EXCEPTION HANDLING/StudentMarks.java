class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

public class StudentMarks {
    public static void checkMarks(int marks) throws InvalidMarkException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Marks should be between 0 and 100.");
        } else {
            System.out.println("Valid marks entered: " + marks);
        }
    }

    public static void main(String[] args) {
        try {
            checkMarks(110);
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
