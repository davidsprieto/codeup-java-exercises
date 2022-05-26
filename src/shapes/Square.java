package shapes;

////     Java II - Inheritance and Polymorphism: #1 - Shapes
//public class Square extends Rectangle {
//    protected double side;
//
//    // Constructor.
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    // Overriding the getArea() method from the "Rectangle" class.
//    public double getArea() {
//        return Math.pow(side, 2);
//    }
//
//    // Overriding the getPerimeter() method from the "Rectangle" class.
//    public double getPerimeter() {
//        return 4 * side;
//    }
//}

// Java II - Interfaces and Abstract Classes: More Shapes
// A SQUARE'S LENGTH = WIDTH AS THE INTERIOR ANGLES ARE 90 DEGREES THUS MEANING THAT THE LENGTH AND WIDTH (SIDES) ARE OF THE SAME VALUE.
// When setLength() and setWidth() get called, the setSides() method runs as setting a length for a square would set the width as well, and vice versa.
public class Square extends Quadrilateral {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public void setLength(double newSide) {
        setSides(newSide);
    }

    public void setWidth(double newSide) {
        setSides(newSide);
    }

    public double setSides(double newSide) {
        this.width = newSide;
        this.length = newSide;
        return this.side = newSide;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side;
    }

}