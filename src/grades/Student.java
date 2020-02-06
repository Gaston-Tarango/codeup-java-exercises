package grades;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String studentName) {
        name = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum =0;
        for (double grade: this.grades){
            sum += grade;
        } return sum / this.grades.size();
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }
}
