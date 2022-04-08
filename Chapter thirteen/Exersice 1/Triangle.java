package com.company.Chapter13.Exersice1;

public class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle(){
        super();
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        super();
        if((side1 + side2) <= side3){
            throw new IllegalTriangleException(side3);
        }
        else if((side1 + side3) <= side2){
            throw new IllegalTriangleException(side2);
        }
        else if((side2 + side3) <= side1){
            throw new IllegalTriangleException(side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3,String color,boolean filled) throws IllegalTriangleException {
        super(color,filled);

        if((side1 + side2) <= side3){
            throw new IllegalTriangleException(side3);
        }
        else if((side1 + side3) <= side2){
            throw new IllegalTriangleException(side2);
        }
        else if((side2 + side3) <= side1){
            throw new IllegalTriangleException(side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public String toString(){
        return "The area is  " + getArea() + " The perimiter is  " + getPerimeter() +
                " the color is = " + getColor() + " is filled " + isFilled();
    }
}
