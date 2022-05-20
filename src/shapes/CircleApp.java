package shapes;
import util.Input;
import java.util.Scanner;

    // #2 CircleApp - Testing Circle Classes/Methods
public class CircleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input userInput = new Input();
        System.out.print("Enter the radius of a circle ---> ");
        double radius = userInput.getDouble();
        System.out.print("Do you wish to continue to find out what the area and circumference of a circle is using the given radius? (Yes/No): ");
        String userContinue = scanner.nextLine();
        if(userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")) {
            Circle circle = new Circle(radius);
            System.out.printf("The area of the circle is %.2f.%n" , circle.getArea());
            System.out.printf("The circumference of the circle is %.2f.%n", circle.getCircumference());
        } else {
            System.out.println("No? Okay, that's cool.");
        }

    }

}
