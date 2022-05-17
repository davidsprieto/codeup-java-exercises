import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // #1 a, b, & c - Loop Basics
        // #1a.
        int i = 5;
        while(i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");

        // #1b.
        int a = 0;
        do {
            System.out.println("a: " + a);
            a = a + 2;
        }while(a <= 100);

        int b = 100;
        do {
            System.out.println("b: " + b);
            b = b - 5;
        }while(b >= -10);

        double c = 2;
        do {
            System.out.printf("c: %.0f\n", c);
            c = Math.pow(c, 2);
        }while(c <= 1000000);

        // #1c.
        for(int d = 5; d <= 15; d++) {
            System.out.print(d + " ");
        }
        System.out.println(" ");

        for(int e = 0; e <= 100; e += 2) {
            System.out.println("e: " + e);
        }

        // #2 - FizzBuzz
        for(double f = 1; f <= 100; f++) {
            if (f % 3 == 0 && f % 5 == 0) {
                System.out.printf("%.0f = FizzBuzz %n", f);
            } else if (f % 5 == 0) {
                System.out.printf("%.0f = Buzz %n", f);
            } else if (f % 3 == 0) {
                System.out.printf("%.0f = Fizz %n", f);
            }
        }

        // #3 - Display a table of powers
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer (whole number): ");
        int userInputNumber = scanner.nextInt();
        System.out.print("You entered the integer: " + userInputNumber + "." + " Do you wish to continue? (Enter Yes/No): ");
        String userContinue = scanner.next();
        if(userContinue.equalsIgnoreCase("Yes")){
            System.out.println("Great, I will display a table of powers from 1 to " + userInputNumber);
            System.out.println( "number | squared | cubed\n" +
                                "------ | ------- | -----");
            for(double g = 1; g <= userInputNumber; g++) {
                double squared = Math.pow(g, 2);
                double cubed = Math.pow(g, 3);
                System.out.printf("%.0f      |%.0f        |%.0f \n", g, squared, cubed);
            }
        } else if(userContinue.equalsIgnoreCase("No")) {
            System.out.println("Okay, I will not display a table of powers for the integer you entered.");
        }

        // #4 - Convert given numbers into letter grades.
        System.out.print("Please enter a number grade between 0 and 100: ");
        int userGrade = scanner.nextInt();
        System.out.print("You entered the grade: " + userGrade + "." + " Do you wish to continue? (Enter Yes/No): ");
        String userContinueToo = scanner.next();
        if(userContinueToo.equalsIgnoreCase("Yes")) {
            System.out.println("Great, I will display your number grade into a letter grade.");
            if(userGrade >= 88 && userGrade <= 100) {
                System.out.println(userGrade + " is an A in letter grade form.");
            } else if (userGrade >= 80 && userGrade <= 87) {
                System.out.println(userGrade + " is a B in letter grade form.");
            } else if (userGrade >= 67 && userGrade <= 79) {
                System.out.println(userGrade + " is a C in letter grade form.");
            }  else if (userGrade >= 60 && userGrade <= 66) {
                System.out.println(userGrade + " is a D in letter grade form.");
            } else if (userGrade >= 0 && userGrade <= 59) {
                System.out.println(userGrade + " is an F in letter grade form.");
            }
        } else if(userContinueToo.equalsIgnoreCase("No")) {
            System.out.println("Okay, I will not display your number grade into a letter grade.");
        }
    }
}
