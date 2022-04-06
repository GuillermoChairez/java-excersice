package com.company;

import com.company.Exersice2.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Student("juan","Mazatlan","6692445813",Student.FRESHMAN);
        Person p2 = new Employee("Guillermo","Culiacan","66944567890","A1",14000);
        Person p3 = new Staff("Kevin","Los mochis","6677834512","A2",15000,"IDK");
        Person p4 = new Faculty("Karim","Sonora","5543241567","A3",20000,12,"IDK");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
