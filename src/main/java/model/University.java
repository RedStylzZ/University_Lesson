package model;

import java.util.Arrays;

public class University {

    String uniName;
    Student[] students;
    Student studentRepresentative;

    public University(String uniName, Student[] students) {
        this.uniName = uniName;
        this.students = students;
        for (Student student : students) {
            if (student.isRepresentative()) {
                this.studentRepresentative = student;
                break;
            }
        }
    }

    public Student[] listStudents() {
        return students;
    }
    public int getStudentCount() {
        return students.length;
    }
    public void addStudent(Student student) {
        students = Arrays.copyOf(students, students.length+1);
        students[students.length-1] = student;
    }
    public void removeStudent(Student student) {
        Student[] newStudents;

        for (int x = 0; x<= students.length-1; x++) {
            if (student.equals(students[x]))
            {
                newStudents = Arrays.copyOfRange(students, 0, x);
                newStudents = Arrays.copyOf(newStudents, students.length-1);
                if(newStudents.length >= x+1) {
                    System.arraycopy(students, x+1, newStudents, x, newStudents.length-1);
                }
                students = Arrays.copyOf(newStudents, newStudents.length);
                return;
            }
        }
    }
    public double getAverageGrade() {
        double sumGrade = 0.0;
        for (Student student : students) {
            sumGrade += student.getGrade();
        }
        return sumGrade / students.length;
    }

    public Student getBestStudent() {
        Student bestStudent = null;
        double bestGrade = 0.0;

        for (Student student : students) {
            if (student.getGrade() > bestGrade) {
                bestGrade = student.getGrade();
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public void setStudentRepresentative(Student student) {
        studentRepresentative.setRepresentative(false);
        student.setRepresentative(true);
        studentRepresentative = student;
    }

    public Student getStudentRepresentative() {
        return studentRepresentative;
    }
}
