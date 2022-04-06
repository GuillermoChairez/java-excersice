package com.company.Exersice2;

public class Faculty extends Employee{
    private int hours;
    private String rank;

    public Faculty(String name, String adrress, String phoneNumber, String office, double salary, int hours, String rank) {
        super(name, adrress, phoneNumber,office, salary);
        this.hours = hours;
        this.rank = rank;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty " + getName();
    }
}
