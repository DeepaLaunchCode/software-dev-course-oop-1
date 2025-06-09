package org.example;

import java.util.ArrayList;

public class Teacher {
    // You'll need to implement this class:
    private String teachername;
    // Add private fields for name and className
    private String classname;
    // Add a constructor that takes a name and className and initializes the corresponding fields
    public Teacher(String teachername, String classname) {
        this.teachername = teachername;
        this.classname = classname;
    }

    // Add getter methods for name and className
    public String getTeacherName() {
        return teachername;
    }

    public String getClassName() {
        return classname;
    }
    // Add setter methods for name and className
    public void setTeacherName(String teachername) {
        this.teachername = teachername;
    }

    public void setClassName(String classname) {
        this.classname = classname;
    }
    // Add a toString method that returns the teacher's name and className in the following format:
    // name (className)

    public String toString() {
        return "" + teachername + " (" + classname + ")";
    }

}
