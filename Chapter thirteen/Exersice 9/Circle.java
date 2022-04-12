package com.company.Chapter13.Exersice9;

public class Circle extends GeometricObject implements Comparable<Circle>{
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
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(Circle c) {
        if(this.equals(c)){
            return 0;
        }
        else if (c.getRadius() > this.radius){
            return -1;
        }
        else{
            return 1;
        }

    }

    public boolean equals(Circle c){
        if(c.getRadius() == this.getRadius())
            return true;
        else
            return false;
    }

}
