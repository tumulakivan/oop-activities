// TUMULAK, IVAN STEIVEN A. - ACTIVITY 35

interface Shape {
    void area();
}

interface Polygon extends Shape {
    void side();
}

class Triangle implements Polygon {
    @Override
    public void area() {
        System.out.println("Calculating area of a triangle.");
    }

    @Override
    public void side() {
        System.out.println("A triangle has 3 sides.");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.side();
    }
}