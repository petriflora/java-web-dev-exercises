package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;

    private String courseOfStudy;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if(this.numberOfCredits <= 29) {
            return "Freshman";
        } else if (this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        this.numberOfCredits += courseCredits;
        double courseQualityScore = courseCredits * grade;
        double  totalQualityScore = this.numberOfCredits * this.getGpa();
        this.gpa = (courseQualityScore + totalQualityScore)/this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    //TO STRING methods print out the object in a format that is customized instead of hex reference to object
    public String toString(){
        return "Student ID: " + this.getStudentId() +
                '\n' + "Student Name: " + this.getName() +
                '\n' + "Course of Study: " + this.getCourseOfStudy() +
                '\n' + "Number of Credits Earned: " + this.getNumberOfCredits() +
                '\n' + "Student GPA: " + this.getGpa();

    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    @Override
    public boolean equals (Object toBeCompared) {
        //check to see if the items to be compared are the same - same object?
        if(toBeCompared == this){
            return true;
        }
        //check to see if the item to be compared is null
        if(toBeCompared == null){
            return false;
        }
        // check to see if the class is the same
        if (toBeCompared.getClass() != this.getClass()) {
            return false;
        }
        //check to see if object we are bringing in is valid - check if student gpa is the same - this should be a unique value
        Student student2 = (Student) toBeCompared;
        return this.gpa == student2.gpa;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
