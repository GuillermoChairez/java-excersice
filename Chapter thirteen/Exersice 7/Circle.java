package com.company.Chapter13.Exersice7;

public class Circle extends GeometricObject {
    private double radius;
    private final double PI = Math.PI;

    public Circle(){
        super();
        this. radius = 1;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public double getPerimeter(){
     return   PI*2*radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all the contour sides");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
