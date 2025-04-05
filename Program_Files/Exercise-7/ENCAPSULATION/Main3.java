
class Cart {
    private double totalPrice;

    public void addItem(double price) {
        if (price > 0) totalPrice += price;
    }

    public double getTotalPrice() { return totalPrice; }
}

public class Main3 {
    public static void main(String[] args) {
        Cart c = new Cart();
        c.addItem(50);
        System.out.println("Total Price: $" + c.getTotalPrice());
    }
}
