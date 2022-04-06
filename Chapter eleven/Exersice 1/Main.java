package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle t1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle: ");
        t1 = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("Enter a color");
        t1.setColor(input.next());
        System.out.println("Enter a true if the triangle is filled and false is not: ");
        t1.setFilled(input.nextBoolean());

        System.out.println("The area is " + t1.getArea());
        System.out.println("The perimiter is " + t1.getPerimeter());
        System.out.println("The color is " + t1.getColor());
        System.out.println("The triangle is filled  " + t1.isFilled());
    }
}
