package com.company.Exersice2;

public class Person {
    private String name;
    private String adrress;
    private String phoneNumber;
    private String email;


    public Person(String name, String adrress, String phoneNumber) {
        this.name = name;
        this.adrress = adrress;
        this.phoneNumber = phoneNumber;
        this.email = name + "@gmail.com";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

