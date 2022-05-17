import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        // #2 - Java I - Strings
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a question, exclamation statement, nothing, or a simple statement for Bob to respond to: ");
        String userStatement = scanner.nextLine();
        if(userStatement.endsWith("?")) {
            System.out.print("Bob says: Sure.");
        } else if(userStatement.endsWith("!")) {
            System.out.println("Bob says: Whoa, chill out!");
        } else if(userStatement.equals("") || userStatement.equals(" ")) {
            System.out.println("Bob says: Fine, be that way!");
        } else {
            System.out.print("Bob says: Whatever.");
        }
    }
}
