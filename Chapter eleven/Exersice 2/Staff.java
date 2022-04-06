package com.company.Exersice2;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String adrress, String phoneNumber, String office, double salary, String title) {
        super(name, adrress, phoneNumber,office,salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff " + getName();
    }
}
