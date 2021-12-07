package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student1 = new Informatikstudent("Tizian", "Informatik", 2.5, false);
    Student student2 = new Wirtschaftsstudent("Ronja", "Wirtschaft", 2.0, true);


    @Test
    void checkSetName() {
        student1.setName("Tizian2");
        student2.setName("Ronja2");
        assertEquals("Tizian2", student1.getName());
        assertEquals("Ronja2", student2.getName());
    }

    @Test
    void checkSetCourse() {
        student1.setCourse("Turtle1");
        student2.setCourse("Turtle2");
        assertEquals("Turtle1", student1.getCourse());
        assertEquals("Turtle2", student2.getCourse());
    }


}