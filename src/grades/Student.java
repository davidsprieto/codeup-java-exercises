package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int grade) {
        setName(name);
        this.grades = new ArrayList<>(grade);
        addGrade(grade);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public String getGradeAverage() {
        double totalGrades = sumOfArray(grades);
        double sizeGrades = grades.size();
        return (totalGrades / sizeGrades) + "%";
    }

    public static double sumOfArray(ArrayList<Integer> grades) {
        return (double) grades.stream().reduce(0, Integer::sum);
    }

    public String getStudentInformation() {
        return ("Student: " + this.getName() + " - Grades: " + this.getGrades() + " - GPA: " + this.getGradeAverage());
    }
}
