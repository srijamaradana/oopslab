interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 5.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 6.2;
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
    }
}
