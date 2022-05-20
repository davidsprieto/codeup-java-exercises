package util;

    // #1 - Input Validation Class - Testing Input.java methods.
public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.getString()); // Prints: what the user enters.

        System.out.println(input.yesNo()); // If you type "yes" or 'y', prints: true. If you type "no" or 'n', prints: false.

        System.out.println(input.getInt()); // Prints: the integer the user enters.

        System.out.println(input.getDouble()); // Prints: the double (decimal number) the user enters.

        System.out.print(input.getInt(1, 20)); // Prints: the integer the user enters as long as it is between 1 and 20. It will continue to ask if it is outside the passed in ranges.

        System.out.print(input.getDouble(1, 50)); // Prints: the double (decimal number) the user enters as long as it is between 1 and 50. It will continue to ask if it is outside the passed in ranges.

    }

}