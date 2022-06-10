import java.util.Arrays;

public class GroovyMorningWarmupExercises {

    // 06/01/22 - Create a function that takes the age in years and returns the age in days:
    // example input: 65
    // expected output: 23725
    public static void ageInDays(int age) {
        System.out.println(age * 365);
    }


    // 06/01/22 - Create a function that takes two numbers and a mathematical operator "+", "-", "/", "*" and will perform a calculation with the given numbers:
    // example inputs: 4, '/', 2
    // expected output: 2
    public static void mathOperation(int num1, String math, int num2) {
        int result = 0;
        switch (math) {
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }
        System.out.println(result);
    }


    // 06/03/22 - Create a method that accepts a string of space separated numbers and returns the highest and lowest number (as a string):
    //example input: "1 2 3 4 5"
    //expected output: "5 1"
    //example input: "1 9 3 4 -5"
    //expected output: "-5 9"
    public static void highLow(String numbers) {
        String[] splitString = numbers.split(" ");
        int lowNum = Integer.parseInt(splitString[0]);
        int highNum = Integer.parseInt(splitString[0]);
        for (int i = 0; i < splitString.length; i++) {
            if (lowNum > Integer.parseInt(splitString[i])) {
                lowNum = Integer.parseInt(splitString[i]);
            } else if (highNum < Integer.parseInt(splitString[i])) {
                highNum = Integer.parseInt(splitString[i]);
            }
        }
        System.out.println(highNum + " " + lowNum);
    }

    // 06/06/22 - Write a function that prints the numbers 1 - 100 unless the number is divisible by 3, 5 or both 3 and 5.
    // If divisible by 3 print "Fizz" . If divisible by 5 print "Buzz". If divisible by both 3 and 5 print "FizzBuzz":
    public static void fizzBuzz() {
        for(int f = 1; f <= 100; f++) {
            if (f % 3 == 0 && f % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (f % 5 == 0) {
                System.out.println("Buzz");
            } else if (f % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(f);
            }
        }
    }

    // 06/09/22 - You bought a few bunches of fruit over the weekend. Create a function that splits a bunch into singular objects inside an array.
    // example input: [{name: "grapes", quantity: 2}]
    // expected output: [{name: "grapes", quantity: 1}, {name: "grapes", quantity: 1}]
    //
    // example input:
    // [{name: "currants", quantity: 1},
    // {name: "grapes", quantity: 2},
    // {name: "bananas", quantity: 2}]
    // expected output:
    // [{name: "currants", quantity: 1},
    // {name: "grapes", quantity: 1},
    // {name: "grapes", quantity: 1},
    // {name: "bananas", quantity: 1},
    // {name: "bananas", quantity: 1}]



    // Main method for testing methods.
    public static void main(String[] args) {
        // 06/01/22 - Testing Warmup:
        ageInDays(65);

        // 06/01/22 - Testing Warmup:
        mathOperation(4, "/", 2);

        // 06/03/22 - Testing Warmup:
        String numbers1 = "1 2 3 4 5";
        highLow(numbers1);

        String numbers2 = "1 9 3 4 -5";
        highLow(numbers2);

        // 06/06/22 - Testing Warmup:
        fizzBuzz();

        // 06/09/22 - Testing Warmup

    }

}