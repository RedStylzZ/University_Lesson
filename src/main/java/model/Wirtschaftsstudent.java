package model;

public class Wirtschaftsstudent extends Student {

    public Wirtschaftsstudent(String name, String course, double grade, boolean isRepresentative) {
        super(name, course, grade, isRepresentative);
    }

    @Override
    public int anzahlModule() {
        return 6;
    }

    @Override
    public String toString() {
        return "Wirtschaftsstudent{" +
                "name='" + this.name + '\'' +
                ", course='" + this.course + '\'' +
                '}';
    }

}
