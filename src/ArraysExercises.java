import java.util.Arrays;

public class ArraysExercises {

    // Method to add a new person to the 'people' array.
    public static Person[] addPerson(Person[] people, Person personToAdd) {
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = personToAdd;
        return people;
    }

    public static void main(String[] args) {
        // #1 - Arrays Basics
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // Prints: [I@129a8472 - need to use Arrays.toString() in order to print the array. What it prints is the memory location of that data when it is compiled.
        System.out.println(Arrays.toString(numbers)); // Prints: [1, 2, 3, 4, 5]

        Person[] people;
        people = new Person[3]; // Can also be written like: Person[] people = new Person[3].
        System.out.println(Arrays.toString(people)); // Prints: [null, null, null], because the elements in the array have no assigned values.
        people[0] = new Person("Joe"); // Creating a new instance of the Person class to each element (lines 21 - 23).
        people[1] = new Person("Bob");
        people[2] = new Person("Bill");
        System.out.println(Arrays.toString(people)); // Prints: [Person@2f7c7260, Person@2d209079, Person@6bdf28bb]. Need to use .getName() method to print the names of each person in the people array. However, cannot chain that method on in this line of code.

        // Iterating through the people array with a 'for' loop to print out the name of each person:
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName()); // Prints: Joe, Bob, Bill on separate lines. Using .getName() method will get the name of the person(s) in the people array.
        }

        // Iterating through the people array with an enhanced 'for' loop to print out the name of each person:
        for (Person person : people) {
            System.out.println(person.getName()); // Also prints: Joe, Bob, Bill on separate lines.
        }

        Person John = new Person("John"); // Creating a new instance of person named John to pass into addPerson method.
        people = addPerson(people, John); // A call to addPerson method while passing in the array of 'people' and 'John' to be added to that array. And assigning that return value to the 'people' array.
        for (int a = 0; a < people.length; a++) {
            System.out.println(people[a].getName()); // Prints: Joe, Bob, Bill, John on separate lines.
        }

    }


}
