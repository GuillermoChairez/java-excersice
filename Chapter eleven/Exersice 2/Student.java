package com.company.Exersice2;

public class Student extends Person{
    private int classStatus;
    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;

    public Student(String name, String adrress, String phoneNumber,int status) {
        super(name, adrress, phoneNumber);
        this.classStatus = status;
    }

   /* public enum Status{
        FRESHMAN,SOPHOMORE,JUNIOR,SENIOR;
    }*/

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student " + getName();
    }
}
