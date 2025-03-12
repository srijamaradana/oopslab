import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product: " + name + " - Price: $" + price);
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void displayOrderDetails() {
        System.out.println("Order Details:");
        double total = 0;
        for (Product p : products) {
            p.displayProduct();
            total += p.price;
        }
        System.out.println("Total: $" + total);
    }
}

public class ShoppingApp {
    public static void main(String[] args) {
        Product p1 = new Product("Smartphone", 700);
        Product p2 = new Product("Headphones", 50);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);
        order.displayOrderDetails();
    }
}
