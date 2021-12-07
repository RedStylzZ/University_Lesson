import model.Informatikstudent;
import model.Student;
import model.University;
import model.Wirtschaftsstudent;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Informatikstudent("Tizian", "Informatik", 2.5, false);
        Student student2 = new Informatikstudent("Nico", "Informatik", 1.0, false);
        Student student3 = new Informatikstudent("Steven", "Informatik", 1.2, false);
        Student student4 = new Wirtschaftsstudent("Ronja", "Wirtschaft", 2.0, true);
        Student student5 = new Wirtschaftsstudent("Joshi", "Wirtschaft", 3.5, false);
        Student student6 = new Wirtschaftsstudent("Turtle", "Wirtschaft", 4.6, false);

        University hogwarts = new University("Hogwarts", new Student[]{student1, student2, student3, student4, student5});

        Student[] students = hogwarts.listStudents();
        System.out.println(Arrays.toString(students));
        System.out.println("Student Count: " +  hogwarts.getStudentCount());
        System.out.println("Best Student: " + hogwarts.getBestStudent());
        System.out.println("Average Grade: " + hogwarts.getAverageGrade());
        System.out.println();
        hogwarts.addStudent(student6);
        System.out.println(Arrays.toString(hogwarts.listStudents()));
        hogwarts.removeStudent(student3);
        System.out.println(Arrays.toString(hogwarts.listStudents()));
        System.out.println("Representative: " + hogwarts.getStudentRepresentative());
        hogwarts.setStudentRepresentative(students[0]);
        System.out.println("Representative: " + hogwarts.getStudentRepresentative());
    }


}
