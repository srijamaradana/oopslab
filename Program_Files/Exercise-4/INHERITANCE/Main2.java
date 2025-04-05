class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving " + brand + " " + model);
    }
}

class ElectricCar extends Vehicle {
    private double batteryCapacity;

    public ElectricCar(String brand, String model, double batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging " + brand + " " + model + " with battery capacity: " + batteryCapacity + " kWh");
    }
}

public class Main2 {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 75);
        electricCar.drive();
        electricCar.charge();
    }
}
