import java.util.Arrays;
import java.util.stream.*; // 05/23/22 - Arrays: imported to use IntStream.of().sum() to add all the numbers in an array.

public class InClassJavaNotes {

    // 05/23/22 - Arrays TODO: Create a method that returns the sum of all integers in an int array (nums):
    public static int sumOfArray(int[] array) {
        int sum = IntStream.of(array).sum();
        return sum;
    }

    // 05/24/22 - Inheritance and Polymorphism: This employee class INHERITED the methods/fields from the Person class.
    static class Employee extends Person {
        public Employee(String employeeName){
            super(employeeName);
        }
    }

    public static void main(String[] args) {
        // 05/23/22 - Arrays TODO: Create an array of strings that stores 3 different weather types ("sunny", "cloudy", etc.):
        String[] weatherTypes = {"sunny", "rainy", "windy"};

        String[] weatherTypes2 = new String[3];
        weatherTypes2[0] = "sunny";
        weatherTypes2[1] = "rainy";
        weatherTypes[2] = "windy";

        String[] weatherTypes3;
        weatherTypes3 = new String[3];
        weatherTypes[0] = "sunny";
        weatherTypes3[1] = "rainy";
        weatherTypes3[2] = "windy";

        // 05/23/22 - Arrays TODO: Create an array of longs to track your daily steps for the last 7 days.
        long[] dailySteps = {3555, 4106, 6859, 3477, 2923, 11070, 92};
        System.out.println(Arrays.toString(dailySteps)); // Prints: the above array ("dailySteps").

        // 05/23/22 - Part of the to do for returning the sum of all numbers in an array method.
        int[] nums = {5, 10, 15, 20, 25};
        System.out.print("The sum of all of the numbers in the passed in array is: "); // I have to print a separate string message then print the sum of all the numbers in an array as the sumOfArray method only returns an "int" data type and not a "string" data type.
        System.out.println(sumOfArray(nums)); // Prints: the sum of all the numbers in the past in array.

        // 05/23/22 - Arrays TODO Iterate through the two-dimensional array and print out every number.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] innerArrays : matrix) {
            System.out.println(Arrays.toString(innerArrays)); // Prints: each element of the matrix which are arrays themselves.
            for(int i = 0; i < innerArrays.length; i++) {
                System.out.println(innerArrays[i]); // Prints: each individual element within the arrays that are elements of the whole matrix.
            }
        }

        // 05/24/22 - Inheritance and Polymorphism
        Employee John = new Employee("John"); // Creating a new instance of "Employee" named "John" which inherited that functionality from the Person class.
        Employee Joe = new Employee("Joe"); // Creating a new instance of "Employee" named "Joe" which inherited that functionality from the Person class.
        John.sayHello(); // Prints: Hello, John! - It inherited the sayHello method from the Person class.
        Joe.sayHello(); // Prints: Hello, Joe! - It inherited the sayHello method from the Person class.
        System.out.println(John.getName()); // Prints: John
        System.out.print(Joe.getName()); // Prints: Joe

    }

}