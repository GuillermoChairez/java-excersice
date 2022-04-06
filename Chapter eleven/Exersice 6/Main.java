package com.company;

import com.company.Exersice4.Arrays;
import com.company.Exersice6.Loan;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList <Object>();
        objects.add(new Loan());
        objects.add(new Date());
        objects.add(new Circle());

        for(Object o: objects){
            System.out.println(o.toString());
        }


    }
}
