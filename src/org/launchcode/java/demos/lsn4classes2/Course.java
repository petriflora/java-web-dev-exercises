package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
//import class Teacher;

public class Course {

    private int courseNumber;
    private String courseName;
    private Teacher instructor;
    private String topic;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();


    public Course(int courseNumber, String courseName) {
        this.setCourseNumber(courseNumber);
        this.setCourseName(courseName);
    }

    public void addStudent(Student student){
        this.enrolledStudents.add(student);
    }

    public String listEnrolledStudentNames() {
        String studentName = "";
        for (Student student : enrolledStudents){
            studentName += ("\n\t" + student.getName());
        } return studentName;
    }


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    public String toString(){
        return "Course Number: " + this.getCourseNumber() +
                '\n' + "Course Name: " + this.getCourseName() +
                '\n' + "Instructor: " + this.getInstructor() +
                '\n' + "Course Topic " + this.getTopic() +
                '\n' + "Number of Students Enrolled: " + this.getEnrolledStudents().size() +
                '\n' + "Names of Students Enrolled: " + this.listEnrolledStudentNames();
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

//    public void setInstructor(String firstName, String lastName, String subject, int i) {
//        return (Teacher.firstName + " " + Teacher.lastName " , " + Teacher.subject + " Years Teaching: " + Teacher.i)
//    }


    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    //NOT WORKING YET - how to get names in array lists from within a related class - get student names from Course class
//    public ArrayList<Student> getEnrolledStudentNames() {
//        return getEnrolledStudents().name;
//    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
