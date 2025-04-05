abstract class BankAccount {
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    void withdraw(double amount) {
        System.out.println("Withdrawn $" + amount + " from Savings Account.");
    }
}

class CheckingAccount extends BankAccount {
    void withdraw(double amount) {
        System.out.println("Withdrawn $" + amount + " from Checking Account.");
    }
}

public class Main9 {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount();
        BankAccount acc2 = new CheckingAccount();
        acc1.withdraw(500);
        acc2.withdraw(1000);
    }
}
