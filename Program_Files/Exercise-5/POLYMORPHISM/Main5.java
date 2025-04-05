class Discount {
    double getDiscount() {
        return 5; // Default discount
    }
}

class GoldMember extends Discount {
        double getDiscount() {
        return 15; // Gold members get higher discounts
    }
}

class PlatinumMember extends Discount {
       double getDiscount() {
        return 25; // Platinum members get even more discount
    }
}

public class Main5 {
    public static void main(String[] args) {
        Discount customer1 = new GoldMember();
        Discount customer2 = new PlatinumMember();

        System.out.println("Gold Member Discount: " + customer1.getDiscount() + "%");
        System.out.println("Platinum Member Discount: " + customer2.getDiscount() + "%");
    }
}
