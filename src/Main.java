
import models.School;
import models.Student;
import models.Person;
import models.Teacher;
import java.util.ArrayList;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);

        File fileS = new File("src/students.txt");
        File fileT = new File("src/teachers.txt");

        Scanner scS = new Scanner(fileS);
        Scanner scT = new Scanner(fileT);

        School school = new School();

        while (scS.hasNextLine()) {
            String name = scS.next();
            String surname = scS.next();
            int age = scS.nextInt();
            String genderString = scS.next();
            boolean gender = genderString.equalsIgnoreCase("Male");

            ArrayList<Integer> scores = new ArrayList<>();
            while (scS.hasNextInt()) {
                scores.add(scS.nextInt());
            }

            int[] scoresArray = new int[scores.size()];
            for (int i = 0; i < scores.size(); i++) {
                scoresArray[i] = scores.get(i);
            }

            // Создаем объект Student с массивом оценок
            Student student = new Student(name, surname, age, gender, scoresArray);
            school.AddMember(student);
//            System.out.println(student);

        }
        scS.close();

        while (scT.hasNextLine()) {
            String name = scT.next();
            String surname = scT.next();
            int age = scT.nextInt();
            String genderString = scT.next();
            boolean gender = genderString.equalsIgnoreCase("Male");
            String subject = scT.next();
            int yearsOfExperience = scT.nextInt();
            int salary = scT.nextInt();

            Teacher teacher = new Teacher(name,  surname,  age,  gender,  subject,  yearsOfExperience,  salary);
            school.AddMember(teacher);

//            System.out.println(teacher);

        }
        scS.close();
        System.out.println(school);
    }
}
