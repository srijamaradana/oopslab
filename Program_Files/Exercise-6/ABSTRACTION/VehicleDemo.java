interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}

public class VehicleDemo{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        bike.start();
    }
}
