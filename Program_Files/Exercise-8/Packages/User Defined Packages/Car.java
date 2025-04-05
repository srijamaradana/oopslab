package IDK;

public class Car {
    private String model;
    private double rate;
    private boolean rented;

    public Car(String model, double rate) {
        this.model = model;
        this.rate = rate;
        this.rented = false;
    }

    public void rent() {
        if (!rented) {
            rented = true;
            System.out.println(model + " rented.");
        } else {
            System.out.println(model + " already rented.");
        }
    }

    public static void main(String[] args) {
        Car c = new Car("BMW", 100);
        c.rent();
        c.rent();
    }
}
