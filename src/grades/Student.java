package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

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
        double sum = grades.stream().reduce(0, Integer::sum);
        return sum;
    }

    public String getStudentInformation() {
        String information = ("Student: " + this.getName() + " - Grades: " + this.getGrades() + " - GPA: " + this.getGradeAverage());
        return information;
    }
}
