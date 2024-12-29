
package models;
import java.util.ArrayList;
import java.util.List;
public class Student extends Person {

    private int studentID;
    private List<Integer> grades = new ArrayList<>();
    private static int id_gen = 1;
    private int gpa;

    public Student(String name, String surname, int age, boolean gender, int[] scoresArray) {
        super(name, surname, age, gender);
        generateID();
        this.grades = new ArrayList<>();
        for (int score : scoresArray) {
            this.grades.add(score);
        }
    }



    private void generateID() {
        studentID = id_gen++;
    }


    public int getStudentID() {
        return studentID;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public void addGradeS(List<Integer> grades) {
        this.grades.addAll(grades);
    }

    public double calculateGPA(){
        int total = 0;
        for(int grade: grades){
            total += grade;
        }
        gpa = (int) ((double) total / grades.size());
        return gpa;
    }



    @Override
    public String toString() {
        return super.toString() + " I am a student with ID" + studentID + " and my gpa is " + calculateGPA();
    }
}
