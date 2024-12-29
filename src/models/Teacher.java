package models;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;

    }

    public int giveRaise(){
        if(yearsOfExperience > 10){
            double raise = salary * (yearsOfExperience / 100.0);
            salary += (int) raise;

        }
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + " My salary is " + giveRaise() + "$";
    }

}
