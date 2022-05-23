import java.util.Arrays;
import java.util.stream.*; // imported to use IntStream.of().sum() to add all the numbers in an array.

public class InClassJavaNotes {

    // 05/23/22 - TODO: Create a method that returns the sum of all integers in an int array (nums):
    public static int sumOfArray(int[] array) {
        int sum = IntStream.of(array).sum();
        return sum;
    }

    public static void main(String[] args) {
        // 05/23/22 - TODO: Create an array of strings that stores 3 different weather types ("sunny", "cloudy", etc.):
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

        // 05/23/22 - TODO: Create an array of longs to track your daily steps for the last 7 days.
        long[] dailySteps = {3555, 4106, 6859, 3477, 2923, 11070, 92};
        System.out.println(Arrays.toString(dailySteps)); // Prints: the above array.

        // 05/23/22 - Part of the to do for returning the sum of all numbers in an array method.
        int[] nums = {5, 10, 15, 20, 25};
        System.out.print("The sum of all of the numbers in the passed in array is: "); // I have to print a separate string message then print the sum of all the numbers in an array as the sumOfArray method only returns an "int" data type and not a "string" data type.
        System.out.println(sumOfArray(nums)); // Prints: the sum of all the numbers in the past in array.

        // 05/23/22 - TODO Iterate through the two-dimensional array and print out every number.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] innerArrays : matrix) {
            // System.out.println(Arrays.toString(innerArrays)); // Prints: each element of the matrix which are arrays themselves.
            for(int i = 0; i < innerArrays.length; i++) {
                System.out.println(innerArrays[i]); // Prints: each individual element within the arrays that are elements of the whole matrix.
            }
        }

    }

}