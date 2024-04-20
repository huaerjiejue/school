package ExperimentTest;

import org.Experiment3.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("John", "MIT", "123456");
    }

    @Test
    void getSchool() {
        assertEquals("MIT", student.getSchool());
    }

    @Test
    void setSchool() {
        student.setSchool("Harvard");
        assertEquals("Harvard", student.getSchool());
    }

    @Test
    void getSchoolNo() {
        assertEquals("123456", student.getSchoolNo());
    }

    @Test
    void setSchoolNo() {
        student.setSchoolNo("654321");
        assertEquals("654321", student.getSchoolNo());
    }

    @Test
    void businessCard() {
        student.businessCard();
    }
}