package shapes;

// #1 - Shapes Java II - Inheritance and Polymorphism:
public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4); // Created a variable of the type "Rectangle" named "box1" and assigned it a new instance of the "Rectangle" class with a length value of 5 and a width value of 4.
        System.out.println(box1.getPerimeter()); // Prints: 18.0
        System.out.println(box1.getArea()); // Prints: 20.0

        Rectangle box2 = new Square(5); // Created a variable of the type "Rectangle" named "box2" and assigned it a new instance of the "Square" class (which inherited the "Rectangle" class's fields and can then use its functionality) with a side value of 5.
        System.out.println(box2.getPerimeter()); // Prints: 20.0
        System.out.println(box2.getArea()); // Prints: 25.0

        // Rerunning the above tests to determine which getArea() and getPerimeter() methods are being called.
        Rectangle box3 = new Rectangle(5, 4);
        System.out.println(box3.getPerimeter()); // Prints: 18.0
        System.out.println(box3.getArea()); // Prints: 20.0

        Rectangle box4 = new Square(5);
        System.out.println(box4.getPerimeter()); // Prints: 20.0
        System.out.println(box4.getArea()); // Prints: 25.0

        // How can you determine which getArea() and getPerimeter() methods are being called on each object?
        // Answer: I believe you can determine it with IntelliJ. On the side where it shows the number for the lines of code, IntelliJ will notify you of the override.
    }

}
