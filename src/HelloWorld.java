public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // #1
        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        // #2
        String myString = "Hello, do you like Java?";
        System.out.println(myString);

        // #3
        // myString = 'd';
        // System.out.println(myString);
        // Output: java: incompatible types: char cannot be converted to java.lang.String

        // #4
        // myString = 3.14159;
        // System.out.println(myString);
        // Output: java: incompatible types: double cannot be converted to java.lang.String

        // #5
        // long myNumber;
        // System.out.println(myNumber);
        // Output: java: variable myNumber might not have been initialized

        // #6
        // long myNumber;
        // myNumber = 3.14;
        // System.out.println(myNumber);
        // Output: java: incompatible types: possible lossy conversion from double to long

        // #7
        // long myNumber;
        // myNumber = 123L;
        // System.out.println(myNumber);
        // Output: 123

        // #8
        // myNumber = 123;
        // System.out.println(myNumber);
        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // Answer: Because you can't store numbers that contain a decimal in the "long" data type. Only the data types "float" and "double" can have decimal number values stored in them.

        // #9
        // float myNumber = 3.14;
        // System.out.println(myNumber);
        // Output: java: incompatible types: possible lossy conversion from double to float
        // What are two ways we could fix this? See #9 Continued:

        // #9 Continued: To create a float with 3.14 you could end the statement with an 'f'
        float myNumber = 3.14f;
        System.out.println(myNumber);

        // #10
        // int x = 5;
        // System.out.println(x++); // prints 5 because it's a post increment. It prints the original initialized/assigned value then increments. So, upon the next print it'll print it's incremented value.
        // System.out.println(x); // prints 6

        int x = 5;
        System.out.println(++x); // prints 6 because it's a pre increment. It will increment the number and print the result of the increment.
        System.out.println(x); // prints 6

        // #11
        // String class = "class";
        // System.out.print(class);
        // Output: java: not a statement // "class" is a reserved word in Java, cannot be used as a variable name.

        // #12
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // System.out.println(three);
        // Output: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:73) - It does not work because they are inconvertible types.

        // #13: Rewrite the following using the relevant shorthand assignment operators:
        // int x = 4;
        // x = x + 5;
        // Solution: x += 5;

        // int x = 3;
        // int y = 4;
        // y = y * x;
        // Solution: y *= x;

        // int x = 10;
        // int y = 2;
        // x = x / y;
        // Solution: x /= y;
        // y = y - x;
        // Solution: y -= x;

        // #14
        // What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
        // What happens if you increment a numeric variable past the type's capacity?
        // Answer: It loops through to the negative scope side of the number values.

    }

}