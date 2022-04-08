package com.company;
import java.util.Scanner;

import com.company.Chapter13.Exersice1.GeometricObject;
import com.company.Chapter13.Exersice1.IllegalTriangleException;
import com.company.Chapter13.Exersice1.Triangle;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        GeometricObject triangle;
        do {
            System.out.print("Enter three sides of a triangle: ");
            try {
                triangle = new Triangle(input.nextDouble(),input.nextDouble(), input.nextDouble());
                System.out.print("Enter a color: ");
                triangle.setColor(input.next());
                System.out.println("Entre true if the traingle is filled or false it is not");
                triangle.setFilled(input.nextBoolean());
                System.out.println(triangle.toString());
                ok = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e);
            }
        } while (!ok);

    }
}
