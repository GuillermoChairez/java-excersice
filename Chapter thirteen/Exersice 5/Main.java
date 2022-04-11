package com.company;

import com.company.Chapter13.Exersice5.Circle;
import com.company.Chapter13.Exersice5.GeometricObject;
import com.company.Chapter13.Exersice5.IllegalTriangleException;
import com.company.Chapter13.Exersice5.Triangle;
import com.sun.jdi.connect.Connector;

public class Main {

    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(4);
        GeometricObject cirlce2 = new Circle(6);
        GeometricObject triangle1;
        GeometricObject triangle2;

        try {
            triangle1 = new Triangle(2, 5, 7);
            triangle2 = new Triangle(3, 6, 8);
        }catch(IllegalTriangleException e){
            triangle1 = new Triangle();
            triangle2 = new Triangle();
        }
        
        System.out.println("the grater circle is " + Circle.max(circle1,cirlce2));
        System.out.println("the grater traingle is " + Triangle.max(triangle1,triangle2));
        System.out.println("The greater geometric object is " + GeometricObject.max(Circle.max(circle1,cirlce2),Triangle.max(triangle1,triangle2)));
    }
}
