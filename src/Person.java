public class Person {
    // #1 - Object Basics
    private String name;

    public Person(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s!%n", name);
    }

    public static void main(String[] args) {
        // #1 - Understanding References
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.name); // Prints: John
        System.out.println(person2.name); // Also, prints: John
        System.out.println(person1.getName()); // Again, prints: John
        System.out.println(person1.getName().equals(person2.getName())); // Prints: true, because person1 & person2 have the same value for name.
        System.out.println(person1 == person2); // Prints: false, because you can't use "==" (comparison operator) to compare Strings since Strings are not data types. Have to use .equals() to compare Strings.

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4); // Prints: true, because the value of person4 was assigned the same value of person3.

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName()); // Prints: John
        System.out.println(person6.getName()); // Also, prints: John
        person6.setName("Jane"); // Setting the name of person6 from John to Jane
        System.out.println(person5.getName()); // Prints: Jane, because the name was set to Jane and person5's value is equal to person6's value (line 36).
        System.out.println(person6.getName()); // Also, prints: Jane
        System.out.println(person6.name); // Again, prints: Jane
        person1.sayHello(); //Prints: Hello, John! - Doesn't need to be wrapped in a System.out.println() as that method already print's to the console. So, just need to call the method.
        person6.sayHello(); // Prints: Hello, Jane!
    }

}
