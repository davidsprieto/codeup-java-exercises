public class GroovyMorningWarmupExercises {

    public static void main(String[] args) {
        // 06/01/22 - Testing Warmup:
        ageInDays(65);

        // 0601/22 - Testing Warmup:
        mathOperation(4, "/", 2);

        // 06/03/22 - Testing Warmup:
        String numbers1 = "1 2 3 4 5";
        highLow(numbers1);

        String numbers2 = "1 9 3 4 -5";
        highLow(numbers2);
    }

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

}
