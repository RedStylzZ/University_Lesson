package model;

import java.util.Objects;

public abstract class Student {

    String name, course;
    double grade;
    boolean isRepresentative;

    public Student(String name, String course, double grade, boolean isRepresentative) {
        this.name = name;
        this.course = course;
        this.grade = grade;
        this.isRepresentative = isRepresentative;
    }

    public void setCourse(String course) {
        if(course.isEmpty()) {
            return;
        }
        this.course = course;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            return;
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }

    public double getGrade() {
        return this.grade;
    }

    public boolean isRepresentative() {
        return this.isRepresentative;
    }

    public void setRepresentative(boolean isRepresentative) {
        this.isRepresentative = isRepresentative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.grade, grade) == 0 && isRepresentative == student.isRepresentative && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, grade, isRepresentative);
    }

    abstract public int anzahlModule();

}
