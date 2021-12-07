package model;

public class Informatikstudent extends Student {

    public Informatikstudent(String name, String course, double grade, boolean isRepresentative) {
        super(name, course, grade, isRepresentative);
    }

    @Override
    public int anzahlModule() {
        return 18;
    }

    @Override
    public String toString() {
        return "Informatikstudent{" +
                "name='" + this.name + '\'' +
                ", course='" + this.course + '\'' +
                '}';
    }
}
