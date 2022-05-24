package shapes;

// #1 - Shapes Java II - Inheritance and Polymorphism:
public class Square extends Rectangle {
    private double side;

    // Constructor.
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    // Overriding the getArea() method from the "Rectangle" class.
    public double getArea() {
        return Math.pow(side, 2);
    }

    // Overriding the getPerimeter() method from the "Rectangle" class.
    public double getPerimeter() {
        return 4 * side;
    }

}
