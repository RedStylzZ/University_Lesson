package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    Student student1 = new Informatikstudent("Tizian", "Informatik", 2.5, false);
    Student student2 = new Informatikstudent("Nico", "Informatik", 1.0, false);
    Student student3 = new Informatikstudent("Steven", "Informatik", 1.2, false);
    Student student4 = new Wirtschaftsstudent("Ronja", "Wirtschaft", 2.0, true);
    Student student5 = new Wirtschaftsstudent("Joshi", "Wirtschaft", 3.5, false);
    Student student6 = new Wirtschaftsstudent("Turtle", "Wirtschaft", 4.6, false);

    University hogwarts = new University("Hogwarts", new Student[]{student1, student2, student3, student4, student5});


    @Test
    void checkStudentCount() {
        assertEquals(5, hogwarts.getStudentCount());
    }

    @Test
    void checkBestStudent() {
        assertEquals(student5, hogwarts.getBestStudent());
    }

    @Test
    void checkListStudents() {
        Student[] students = new Student[]{student1, student2, student3, student4, student5};
        System.out.println(students[0]);
        System.out.println(hogwarts.listStudents()[0]);
        assertEquals(students.length, hogwarts.listStudents().length);
    }

    @Test
    void checkStudentRepresentative() {
        assertEquals(student4, hogwarts.getStudentRepresentative());
    }

    @Test
    void checkSetStudentRepresentative() {
        assertEquals(student4, hogwarts.getStudentRepresentative());
        hogwarts.setStudentRepresentative(student1);
        assertEquals(student1, hogwarts.getStudentRepresentative());
    }

    @Test
    void checkAverageGrade() {
        assertEquals(2.04, hogwarts.getAverageGrade());
    }

    @Test
    void checkAddStudent() {
        Student[] students = new Student[5];
        Student[] students2 = new Student[6];
        assertEquals(students.length, hogwarts.listStudents().length);
        hogwarts.addStudent(student6);
        assertEquals(students2.length, hogwarts.listStudents().length);

    }

    @Test
    void checkRemoveStudent() {
        Student[] students = new Student[5];
        Student[] students2 = new Student[4];
        assertEquals(students.length, hogwarts.listStudents().length);
        hogwarts.removeStudent(student1);
        assertEquals(students2.length, hogwarts.listStudents().length);
    }

}