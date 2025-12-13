package encapsulation.student;

import java.util.ArrayList;
import java.util.List;

class Student{
    private int student_id;
    private List<Double> student_grade;
    private String student_name;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public List<Double> getStudent_grade() {
        return student_grade;
    }

    public void addGrade(double grade){
        if (student_grade == null){
            student_grade = new ArrayList<>();
        }
        student_grade.add(grade);
    }


}

public class Class {
    public static void main(String[] args) {
        Student q = new Student();
        q.setStudent_id(14441);
        q.setStudent_name("John");


        q.addGrade(45);
        q.addGrade(99);
        q.addGrade(100);
        q.addGrade(78);

        System.out.println("Student_Name: " + q.getStudent_name());
        System.out.println("Student_Id: " + q.getStudent_id());
        System.out.println("Grades: " + q.getStudent_grade());

    }
}
