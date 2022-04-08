package com.company;

import com.company.Chapter12.Exersice1.Exerscie4.Loan;
import com.company.Chapter12.Exersice1.Exersice5.GeometricObject;
import com.company.Chapter12.Exersice1.Exersice5.IllegalTriangleException;
import com.company.Chapter12.Exersice1.Exersice5.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;

        do {
            System.out.println("Enter the 3 sides of a triangle: ");
            try {
                GeometricObject triangle  = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
                System.out.println(triangle.toString());
                ok = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e);
            }
        } while (!ok);

    }
}
