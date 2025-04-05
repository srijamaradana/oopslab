class Bank {
    double getInterestRate() {
        return 5.0; // Default interest rate
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5; // SBI offers 6.5% interest
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0; // HDFC offers 7.0% interest
    }
}

public class Main4 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}
