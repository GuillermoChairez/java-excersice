package com.company.Chapter13.Exersice7;

public class Square extends GeometricObject{
    private double side;

    public Square(){
        super();
        this.side = 0;
    }

    public Square(double side){
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    public double getPerimeter(){
        return 4*side;
     }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
