package util;
import com.sun.jdi.IntegerValue;

import java.util.InputMismatchException;
import java.util.Scanner;

    // #1 Creating Input Validation Classes/Methods
public class Input {
    private Scanner scanner;

    public Input() {
        System.out.print("");
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("Enter Yes/No: ");
        String input = this.getString();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        int number;
        do {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            number = scanner.nextInt();
        } while(number < min || number > max);
        return number;
    }

    // 05/31/22 - Java II - Exceptions and Error Handling Exercises:
//    public int getInt(int min, int max) {
//        int number = 1;
//        do {
//            System.out.printf("Please enter an integer between %d and %d: ", min, max);
//            String s = getString();
//            try {
//                number = Integer.parseInt(s);
//            } catch (NumberFormatException nfe) {
//                System.out.println(nfe.getMessage() + " is not an integer.");
////                getInt(min, max);
//            } catch (Exception e) {
//                System.out.println(e.getMessage() + " is not a valid input.");
////                getInt(min, max);
//            }
//        } while(number < min || number > max);
//        return number;
//    }

    public int getInt() {
        System.out.print("Please enter an integer: ");
        return this.scanner.nextInt();
    }

//    // 05/31/22 - Java II - Exceptions and Error Handling Exercises:
//    public int getInt() {
//        System.out.print("Please enter an integer: ");
//        String s = getString();
//        int value = 1;
//        try {
//            value = Integer.parseInt(s);
//        } catch (NumberFormatException nfe) {
//            System.out.println(nfe.getMessage() + " is not an integer.");
////            getInt();
//        }
//        return value;
//    }

    public double getDouble(double min, double max) {
        double number;
        do {
            System.out.printf("%nPlease enter a double (decimal number) between %.2f and %.2f: ", min, max);
            number = scanner.nextDouble();
        } while(number < min || number > max);
        return number;
    }

    // 05/31/22 - Java II - Exceptions and Error Handling Exercises:
//    public double getDouble(double min, double max) {
//        double number = 1;
//        do {
//            System.out.printf("Please enter a double between %.1f and %.1f: ", min, max);
//            String s = getString();
//            try {
//                number = Double.parseDouble(s);
//            } catch (NumberFormatException nfe) {
//                System.out.println(nfe.getMessage() + " is not a double.");
////                getDouble(min, max);
//            } catch (Exception e) {
//                System.out.println(e.getMessage() + " is not a valid input.");
////                getDouble(min, max);
//            }
//        } while(number < min || number > max);
//        return number;
//    }

    public double getDouble() {
        System.out.print("Please enter a double (decimal number): ");
        return this.scanner.nextDouble();
    }

    // 05/31/22 - Java II - Exceptions and Error Handling Exercises:
//    public double getDouble() {
//        System.out.print("Please enter a double (decimal number): ");
//        String s = getString();
//        double value = 1.0;
//        try {
//            value = Double.parseDouble(s);
//        } catch (NumberFormatException nfe) {
//            System.out.println(nfe.getMessage() + " is not a double.");
////            getDouble();
//        }
//        return value;
//    }

}
