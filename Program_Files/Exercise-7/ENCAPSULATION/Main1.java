class Car {
    private int speed;

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) this.speed = speed;
        else System.out.println("Invalid speed!");
    }

    public int getSpeed() { return speed; }
}

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(120);
        System.out.println("Speed: " + myCar.getSpeed() + " km/h");
    }
}
