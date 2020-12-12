package org.launchcode.java.demos.lsn3classes1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course {

    private int number;
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
//don't want to create a new arraylist so this method functions like a setter
    public void addStudent(Student student){
        this.students.add(student);
    }
}
