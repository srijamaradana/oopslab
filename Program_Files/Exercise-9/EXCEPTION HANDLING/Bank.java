class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Bank {
    static void withdraw(double amount, double balance) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        } else {
            System.out.println("Withdrawal successful. Remaining: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(1500, 1000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
