package org.Experiment3;

public class Student extends Person {
    private String school;
    private String schoolNo;

    public Student(String name, String school, String schoolNo) {
        super(name);
        this.school = school;
        this.schoolNo = schoolNo;
    }

    public Student() {
        super();
        this.school = "No School";
        this.schoolNo = "No School Number";
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolNo() {

        return this.schoolNo;
    }

    public void setSchoolNo(String schoolNo) {
        this.schoolNo = schoolNo;
    }

    public void businessCard() {
        System.out.println("Name: " + super.getName());
        System.out.println("School: " + this.school);
        System.out.println("School Number: " + this.schoolNo);
    }

}
