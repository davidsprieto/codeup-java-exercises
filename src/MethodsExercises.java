import java.util.Scanner;

public class MethodsExercises {

    // #1 - Basic Arithmetic
    public static int add(int num1, int num2) {
        return (num1 + num2);
    }

    public static int subtract(int num1, int num2) {
        return (num1 - num2);
    }

    public static int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public static int divide(int num1, int num2) {
        return (num1 / num2);
    }

    public static int modulus(int num1, int num2) {
        return (num1 % num2);
    }

    // #2 - Validate user input
    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput < 1 || userInput > 10) {
            System.out.println("Invalid input. Please try again.");
            getInteger();
        } else {
            System.out.println("Valid input.");
        }
        return userInput;
    }

    // #3 - Calculate factorial
    public static int factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10 again: ");
        int userNumber = scanner.nextInt();
        System.out.print("You entered " + userNumber + "." + " Do you wish to continue (Yes/No)?");
        String userContinue = scanner.next();
        if(userContinue.equalsIgnoreCase("Yes") && userNumber >= 1 && userNumber <= 10) {
            long fact = 1;
            for(int i = 1; i <= userNumber; i++) {
                fact = fact * i;
                System.out.println("Factorial of " + userNumber + " is: " + fact);
            }
        } else if(userNumber <= 0 || userNumber >= 11) {
            System.out.println("Invalid input. Please try again.");
            factorial();
        } else if(userContinue.equalsIgnoreCase("No")) {
            System.out.println("Okay, that's fine.");
        }
        return userNumber;
    }


    public static void main(String[] args) {
        System.out.println("Addition result: " + add(5, 5));
        System.out.println("Subtraction result: " + subtract(20, 15));
        System.out.println("Multiplication result: " + multiply(3, 6));
        System.out.println("Division result: " + divide(75, 5));
        System.out.println("Modulus result: " + modulus(56, 11));

        getInteger();
        factorial();
    }

}