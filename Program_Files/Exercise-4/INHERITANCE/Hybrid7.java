interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class ColoredCircle extends Circle {
    void fillColor() {
        System.out.println("Filling color in Circle");
    }
}

class TransparentCircle extends Circle {
    void transparency() {
        System.out.println("Making Circle transparent");
    }
}

public class Hybrid7 {
    public static void main(String[] args) {
        ColoredCircle c = new ColoredCircle();
        c.draw();
        c.fillColor();
        
        TransparentCircle t = new TransparentCircle();
        t.draw();
        t.transparency();
    }
}
