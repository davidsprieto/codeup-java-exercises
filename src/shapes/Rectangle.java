package shapes;

////     Java II - Inheritance and Polymorphism: #1 - Shapes
//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    // This is a constructor that accepts two "doubles" (length and width) and sets those properties.
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//}

// Java II - Interfaces and Abstract Classes: More Shapes
public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public void setLength(double newLength) {
        this.length = newLength;
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

}

