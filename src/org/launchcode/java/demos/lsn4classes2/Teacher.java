package org.launchcode.java.demos.lsn4classes2;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    @Override
    //TO STRING methods print out the object in a format that is customized instead of hex reference to object
    public String toString(){
        return "Teacher: " + this.getFirstName() + " " + this.getLastName() +
                '\n' + '\t' + "Subject Taught: " + this.getSubject() +
                '\n' + '\t' +  "Years in Teaching: " + this.getYearsTeaching();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
