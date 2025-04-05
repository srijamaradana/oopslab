class Bank {
    void deposit(int amount) {
        System.out.println("Deposited: $" + amount);
    }
    void deposit(int amount, String message) {
        System.out.println("Deposited: $" + amount + " - " + message);
    }
    void deposit(double amount, double interestRate) {
        double total = amount + (amount * interestRate / 100);
        System.out.println("Deposited with interest: $" + total);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.deposit(1000);
        bank.deposit(2000, "Salary deposit");
        bank.deposit(5000, 5.0);
    }
}
