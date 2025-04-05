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

class Car extends Vehicle {
    private int wheels;

    public Car(String brand, String model, int wheels) {
        super(brand, model);
        this.wheels = wheels;
    }

    public void displayWheels() {
        System.out.println(brand + " " + model + " has " + wheels + " wheels");
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String brand, String model, int wheels, double batteryCapacity) {
        super(brand, model, wheels);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging " + brand + " " + model + " with battery capacity: " + batteryCapacity + " kWh");
    }
}

public class Main7 {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 4, 75);
        electricCar.drive();
        electricCar.displayWheels();
        electricCar.charge();
    }
}
