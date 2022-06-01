package grades;
import util.Input;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();

        Student Thor;
        students.put("PointBreak", Thor = new Student("Thor", 88));
        Thor.addGrade(90);
        Thor.addGrade(92);

        Student Hulk;
        students.put("JollyGreen", Hulk = new Student("Hulk", 100));
        Hulk.addGrade(99);
        Hulk.addGrade(98);

        Student Hawkeye;
        students.put("Legolas", Hawkeye = new Student("Hawkeye", 93));
        Hawkeye.addGrade(95);
        Hawkeye.addGrade(97);

        Student Drax;
        students.put("MrClean", Drax = new Student("Drax", 75));
        Drax.addGrade(73);
        Drax.addGrade(71);

        System.out.println("Welcome! \n\nHere are the GitHub usernames of our students:");
        String userInput;

        do {
            System.out.print("\n");
            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
            }
            System.out.println("\n\nWhat student would you like to see more information on?\n");
            System.out.print("> ");
            userInput = input.getString();
            Student student = students.get(userInput);
            if (student == null) {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\".\n");
            } else {
                System.out.printf("\nName: %s - GitHub Username: %s\n", student.getName(), userInput);
                System.out.printf("Current Average: %s\n\n", student.getGradeAverage());
            }
            System.out.println("Would you like to see another student?\n");
            System.out.print("> ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));

        System.out.println("\nGoodbye, and have a wonderful day!");
    }

}
