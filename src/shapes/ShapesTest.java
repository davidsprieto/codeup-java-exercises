package shapes;

//// Java II - Inheritance and Polymorphism: #1 - Shapes
//public class ShapesTest {
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4); // Created a variable of the type "Rectangle" named "box1" and assigned it a new instance of the "Rectangle" class with a length value of 5 and a width value of 4.
//        System.out.println(box1.getPerimeter()); // Prints: 18.0
//        System.out.println(box1.getArea()); // Prints: 20.0
//
//        Rectangle box2 = new Square(5); // Created a variable of the type "Rectangle" named "box2" and assigned it a new instance of the "Square" class (which inherited the "Rectangle" class's fields and can then use its functionality) with a side value of 5.
//        System.out.println(box2.getPerimeter()); // Prints: 20.0
//        System.out.println(box2.getArea()); // Prints: 25.0
//
//        // Rerunning the above tests to determine which getArea() and getPerimeter() methods are being called.
//        Rectangle box3 = new Rectangle(5, 4);
//        System.out.println(box3.getPerimeter()); // Prints: 18.0
//        System.out.println(box3.getArea()); // Prints: 20.0
//
//        Rectangle box4 = new Square(5);
//        System.out.println(box4.getPerimeter()); // Prints: 20.0
//        System.out.println(box4.getArea()); // Prints: 25.0
//
//        // How can you determine which getArea() and getPerimeter() methods are being called on each object?
//        // Answer: I believe you can determine it with IntelliJ. On the side where it shows the number for the line of code, IntelliJ will notify you of the override.
//    }
//}


// Java II - Interfaces and Abstract Classes: More Shapes
// TESTING the
public class ShapesTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4); // Created a variable of the type "Rectangle" named "rectangle" and assigned it a new instance of the "Rectangle" class with a length value of 5 and a width value of 4.
        System.out.println(rectangle.getArea()); // Prints: 20.0
        System.out.println(rectangle.getPerimeter()); // Prints: 18.0
        System.out.println(rectangle.getLength()); // Prints: 5.0
        System.out.println(rectangle.getWidth()); // Prints: 4.0
        rectangle.setLength(10); // Now setting/reassigning the length of "rectangle" from the value of 5 to 10.
        rectangle.setWidth(8); // Now setting/reassigning the width of "rectangle" from the value of 4 to 8.
        System.out.println(rectangle.getLength()); // Prints: 10.0
        System.out.println(rectangle.getWidth()); // Prints: 8.0
        System.out.println(rectangle.getArea()); // Prints: 80.0
        System.out.println(rectangle.getPerimeter()); // Prints: 36.0

        Square square = new Square(5); // Created a variable of the type "Square" named "square" and assigned it a new instance of the "Square" class with a length & width value of 5.
        System.out.println(square.getArea()); // Prints: 25.0
        System.out.println(square.getPerimeter()); // Prints: 20.0
        System.out.println(square.getLength()); // Prints: 5.0
        System.out.println(square.getWidth()); // Prints: 5.0 - A SQUARE'S LENGTH = WIDTH AS ITS SIDES ARE OF EQUAL VALUE BECAUSE ITS INTERIOR ANGLES ALL EQUAL 90 DEGREES.
        square.setLength(10); // Now setting/reassigning the length of "square" from the value of 5 to 10. Which ALSO sets its width from a value of 5 to 10.
        System.out.println(square.getLength()); // Prints: 10.0
        System.out.println(square.getWidth()); // Prints: 10.0
        System.out.println(square.getArea()); // Prints: 100.0
        System.out.println(square.getPerimeter()); // Prints: 40.0

        Measurable myShape; // Creating a variable called "myShape" with a type of "Measurable"

        myShape = rectangle; // Assigning "myShape" with the values that "rectangle" has.
        System.out.println(myShape.getArea()); // Prints: 80.0 - As it should as it has the values of "rectangle" and "rectangle"'s length was reassigned on line 39 and its width was reassigned on line 40.
        System.out.println(myShape.getPerimeter()); // Prints: 36.0 - As it should as it has the values of "rectangle" and "rectangle"'s length was reassigned on line 39 and its width was reassigned on line 40.

        myShape = square; // Now reassigning "myShape" with the values that "square" has.
        System.out.println(myShape.getArea()); // Prints: 100.0 - As it should as it has the values of "square" and "square"'s length & width was reassigned on line 51.
        System.out.println(myShape.getPerimeter()); // Prints: 40.0 - As it should as it has the values of "square" and "square"'s length & width was reassigned on line 51.

        // TODO: Why does the code fail to compile if you leave off the getPerimeter() method in Rectangle?
        // Because the Rectangle class implements the Measurable interface which means the behavior of getPerimeter() needs to be addressed. Meaning, the getPerimeter() method in Rectangle needs a code body.

        // TODO: What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        //

    }

}