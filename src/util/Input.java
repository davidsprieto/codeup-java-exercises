package util;
import java.util.Scanner;

    // #1 Creating Input Validation Classes/Methods
public class Input {
    private Scanner scanner;


    public Input() {
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

    public int getInt() {
        System.out.print("Please enter an integer: ");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double number;
        do {
            System.out.printf("%nPlease enter a double (decimal number) between %.2f and %.2f: ", min, max);
            number = scanner.nextDouble();
        } while(number < min || number > max);
        return number;
    }

    public double getDouble() {
        System.out.print("Please enter a double (decimal number): ");
        return this.scanner.nextDouble();
    }


}
