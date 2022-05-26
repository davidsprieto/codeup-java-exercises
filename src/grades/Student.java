package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

}
