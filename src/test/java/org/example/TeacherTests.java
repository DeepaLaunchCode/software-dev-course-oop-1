package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTests {
    @Test
    public void testCreateTeacher() {
        Teacher teacher = new Teacher("Alice", "Math");
        assertEquals("Alice", teacher.getTeacherName());
        assertEquals("Math", teacher.getClassName());
    }

    @Test
    public void testGettersAndSetters() {
        Teacher teacher = new Teacher("Alice", "Math");
        teacher.setTeacherName("Bob");
        teacher.setClassName("Science");
        assertEquals("Bob", teacher.getTeacherName());
        assertEquals("Science", teacher.getClassName());
    }

    @Test
    public void testToString() {
        Teacher teacher = new Teacher("Alice", "Math");
        assertEquals("Alice (Math)", teacher.toString());
    }
}
