package com.company.Chapter13.Exersice7;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){
        super();
        width = 1;
        height = 1;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width +height);
    }

    public Rectangle(double width,double height){
        super();
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void howToColor() {
        System.out.println("Color the width and the heigth ");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
