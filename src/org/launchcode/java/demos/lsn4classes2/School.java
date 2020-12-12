package org.launchcode.java.demos.lsn4classes2;

public class School {
    public static void main(String[] args){

        Student buck = new Student("Buck Geary", 11337,97,3.39);
//        System.out.println(buck.getGradeLevel());
        buck.setGpa(3.2);
//        System.out.println(buck.getGpa());
        buck.addGrade(3,4.0);
//        System.out.println(buck);

        Student anotherBuck = new Student("Buck Geary",11337,97,3.39);
//        System.out.println(buck.equals(anotherBuck));

       Student jen = new Student("Jen Morgan", 34567,15,3.6);
        jen.setCourseOfStudy("CoderGirl / Java");
        jen.setNumberOfCredits(49);
        jen.setGpa(4.0);

        Student atticus = new Student("Atticus Wants To Learn To Code",98765,56,3.6 );
        atticus.setCourseOfStudy("not yet selected");
        atticus.setNumberOfCredits(0);
        atticus.setGpa(0.0);

        Teacher mike = new Teacher("Mike", "Tully", "Java", 12);

        Course java = new Course(101, "Getting to Know Java");
        java.setTopic("Computer Science");
        java.setInstructor(mike);
        java.addStudent(buck);
        java.addStudent(jen);
        java.addStudent(atticus);
        System.out.println(java);
    }
}
