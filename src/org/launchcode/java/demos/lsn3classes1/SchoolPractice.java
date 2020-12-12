package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student jen = new Student(34567, "Jen Morgan");
        jen.setCourseOfStudy("CoderGirl / Java");
        jen.setNumberOfCredits(49);
        jen.setGpa(4.0);

        Student atticus = new Student(98765, "Atticus Wants To Learn To Code");
        atticus.setCourseOfStudy("not yet selected");
        atticus.setNumberOfCredits(0);
        atticus.setGpa(0.0);

        Course java = new Course(101, "Intro to Java");
        java.addStudent(jen);
        java.addStudent(atticus);

        System.out.println("Course: " + java.getNumber() + " " + java.getName() +
                '\n' + '\t' +"Students Enrolled:" + '\n');
        System.out.println(java.getStudents());

        System.out.println("Student ID: " + jen.getStudentId() +
                '\n' + "Student Name: " + jen.getName() +
                '\n' + "Course of Study: " + jen.getCourseOfStudy() +
                '\n' + "Number of Credits Earned: " + jen.getNumberOfCredits() +
                '\n' + "Student GPA: " + jen.getGpa());
        System.out.println('\n' + "**********" + '\n');
        System.out.println("Student ID: " + atticus.getStudentId() +
                '\n' + "Student Name: " + atticus.getName() +
                '\n' + "Course of Study: " + atticus.getCourseOfStudy() +
                '\n' + "Number of Credits Earned: " + atticus.getNumberOfCredits() +
                '\n' + "Student GPA: " + atticus.getGpa());
        System.out.println('\n' + "**********" + '\n');
    }
}
