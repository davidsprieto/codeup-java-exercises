import java.util.Scanner;
import java.util.Random;

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
    public static void getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput < 1 || userInput > 10) {
            System.out.println("Invalid input. Please try again.");
            getInteger();
        } else {
            System.out.println("Valid input.");
        }
    }

    // #3 - Calculate factorial
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10 again: ");
        int userNumber = scanner.nextInt();
        System.out.print("You entered " + userNumber + "." + " Do you wish to continue (Yes/No)? ");
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
    }

    // #4 - Dice Rolling
    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of sides for a pair of dice: ");
        int userDiceSides = scanner.nextInt();
        System.out.print("You entered " + userDiceSides + "." + " Would you like to roll the dice - (Yes/No)? ");
        String userContinue = scanner.next();
        if(userContinue.equalsIgnoreCase("Yes")) {
            Random random = new Random();
            int low = 1;
            int high = 7;
            int dice1 = random.nextInt(high-low) + low;
            int dice2 = random.nextInt(high-low) + low;
            System.out.println("You rolled a " + dice1 + " for the first die and a " + dice2 + " for the second die.");
            System.out.print("Would you like to roll again - (Yes/No)? ");
            String userRollAgain = scanner.next();
            if(userRollAgain.equalsIgnoreCase("Yes")) {
                System.out.println("Great!");
                rollDice();
            } else {
                System.out.println("No? Okay, that's fine.");
            }
        } else if (userContinue.equalsIgnoreCase("No")) {
            System.out.println("Okay, that's fine.");
        }
    }

    // #5 - Game Development 101
    public static void guessNum() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1;
        int high = 101;
        int randomNumber = random.nextInt(high-low) + low;
        System.out.print("Please guess a number between 1 and 100: ");
        int userRandomNum = scanner.nextInt();
        if(userRandomNum < randomNumber) {
            System.out.println("HIGHER");
            System.out.print("GUESS AGAIN: ");
            int userRandomNum2 = scanner.nextInt();
            if(userRandomNum2 < randomNumber) {
                System.out.println("HIGHER");
                System.out.println("The number was: " + randomNumber + ".");
            } else if(userRandomNum2 > randomNumber) {
                System.out.println("LOWER");
                System.out.println("The number was: " + randomNumber + ".");
            } else if(userRandomNum2 == randomNumber) {
                System.out.print("CORRECT! GOOD GUESS!");
            }
        } else if(userRandomNum > randomNumber) {
            System.out.println("LOWER");
            System.out.print("GUESS AGAIN: ");
            int userRandomNum3 = scanner.nextInt();
            if(userRandomNum3 < randomNumber) {
                System.out.println("HIGHER");
                System.out.println("The number was: " + randomNumber + ".");
            } else if(userRandomNum3 > randomNumber) {
                System.out.println("LOWER");
                System.out.println("The number was: " + randomNumber + ".");
            } else if(userRandomNum3 == randomNumber) {
                System.out.print("CORRECT! GOOD GUESS!");
            }
        } else if (userRandomNum == randomNumber) {
            System.out.print("CORRECT! GOOD GUESS!");
        }
    }


    public static void main(String[] args) {
        System.out.println("Addition result: " + add(5, 5));
        System.out.println("Subtraction result: " + subtract(20, 15));
        System.out.println("Multiplication result: " + multiply(3, 6));
        System.out.println("Division result: " + divide(75, 5));
        System.out.println("Modulus result: " + modulus(56, 11));

        getInteger();
        factorial();
        rollDice();
        guessNum();
    }

}