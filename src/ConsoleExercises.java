import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        // #1 - System.out.printf()
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f.", pi); // Can be written using "printf".
        System.out.format("%nThe value of pi is %.2f.%n", pi); // Can also be written using "format". "%n" prints to a new line.

        // #1 to #4 - Scanner Class
        // #1
        Scanner newScanner = new Scanner(System.in);

        System.out.print("Please enter an integer (a whole number): ");
        int userInputInt = newScanner.nextInt();
        System.out.println("The integer you entered is: " + userInputInt);
        // What happens if you input something that is not an integer?
        // Answer: Java gives you an error message for "InputMismatchException".

        // #2
        System.out.println("Please enter three words: ");
        String userInput1 = newScanner.next();
        String userInput2 = newScanner.next();
        String userInput3 = newScanner.next();
        System.out.println("The three words you entered are: ");
        System.out.println(userInput1);
        System.out.println(userInput2);
        System.out.println(userInput3);

        // Can also be written as:
        System.out.printf("The three words you entered are: %n%s %n%s %n%s %n", userInput1, userInput2, userInput3);
        // "%s" is a placeholder which will be replaced by the values of userInput1, userInput2, & userInput3.
        // Again, "%n" prints to a new line. Combine both "%s" and "%n" to print the values of userInputs to new lines.

        // #3
        // System.out.println("Please enter a sentence: ");
        // String userInputString = newScanner.next();
        // System.out.println("The sentence you entered is: " + userInputString);
        // Output: Only the first word of the sentence is printed to the console as the .next() method only captures the next word. Use .nextLine() method to capture the entire line/sentence.

        // #4
        System.out.println("Please enter a sentence: ");
        String userInputString2 = newScanner.nextLine();
        System.out.println("The sentence you entered is: " + userInputString2);

        // Can also be written as:
//        System.out.printf("The sentence you entered is: %s", userInputString2);

    }
}
