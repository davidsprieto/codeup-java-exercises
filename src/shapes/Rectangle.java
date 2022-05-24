package shapes;

// #1 - Shapes - Java II - Inheritance and Polymorphism:
public class Rectangle {
    protected double length;
    protected double width;

    // This is a constructor that accepts two "doubles" (length and width) and sets those properties.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

}
