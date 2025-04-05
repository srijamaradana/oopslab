abstract class Loan {
    abstract void calculateInterest();
}

class HomeLoan extends Loan {
      void calculateInterest() {
        System.out.println("Home Loan interest rate is 5% per year.");
    }
}

class CarLoan extends Loan {
        void calculateInterest() {
        System.out.println("Car Loan interest rate is 7% per year.");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Loan l1 = new HomeLoan();
        Loan l2 = new CarLoan();
        l1.calculateInterest();
        l2.calculateInterest();
    }
}
