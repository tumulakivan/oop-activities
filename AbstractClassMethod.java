// TUMULAK, IVAN STEIVEN A. - ACTIVITY 32

abstract class Shape {
    public int age;

    public Shape(int age) {
        this.age = age;
    }

    public abstract void draw();

    public abstract int show();

    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    public Circle(int age) {
        super(age);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public int show() {
        return age + 5;
    }
}

class Rectangle extends Shape {
    public Rectangle(int age) {
        super(age);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public int show() {
        return age + 10;
    }
}

public class AbstractClassMethod {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayInfo();
        circle.draw();
        System.out.println(circle.show());

        Rectangle rectangle = new Rectangle(10);
        rectangle.displayInfo();
        rectangle.draw();
        System.out.println(rectangle.show());
    }
}