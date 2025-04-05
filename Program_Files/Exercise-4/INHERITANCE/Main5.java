class Shape {
    public void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void area() {
        System.out.println("Area of Circle: " + Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public void area() {
        System.out.println("Area of Rectangle: " + width * height);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        circle.area();
        rectangle.area();
    }
}
