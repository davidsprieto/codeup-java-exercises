package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student Bob = new Student("Bob", 95); // Created a variable of the type "Student" named "Bob" and stored in that variable a new instance of the "Student" class with a name value of "Bob" and a grade value of "95".
        System.out.println(Bob.getName()); // Prints: Bob
        System.out.println(Bob.getGrades()); // Prints: [95]
        Bob.addGrade(99); // Adding a grade to Bob's "grades" ArrayList<Integer> (lines 9 - 11).
        Bob.addGrade(88);
        Bob.addGrade(92);
        System.out.println(Bob.getGrades()); // Prints: [95, 99, 88, 92]
        System.out.println(Bob.getGradeAverage()); // Prints: 93.5%
        System.out.println(Bob.getStudentInformation()); // Prints: Student: Bob - Grades: [95, 99, 88, 92] - GPA: 93.5%.

        Student John = new Student("John", 96); // Created a variable of the type "Student" named "John" and stored in that variable a new instance of the "Student" class with a name value of "John" and a grade value of "96".
        System.out.println(John.getName()); // Prints: John
        System.out.println(John.getGrades()); // Prints: [96]
        John.addGrade(87); // Adding a grade to John's "grades" ArrayList<Integer> (lines 19 - 21).
        John.addGrade(93);
        John.addGrade(91);
        System.out.println(John.getGrades()); // Prints: [96, 87, 93, 91]
        System.out.println(John.getGradeAverage()); // Prints: 91.75%
        System.out.println(John.getStudentInformation()); // Prints: Student: John - Grades: [96, 87, 93, 91] - GPA: 91.75%.
    }

}
