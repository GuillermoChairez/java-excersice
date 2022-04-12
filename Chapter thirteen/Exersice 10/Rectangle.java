package com.company.Chapter13.Exersice10;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
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
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Rectangle r) {
        if(this.equals(r)){
            return 0;
        }
        else if(r.getArea() > this.getArea()){
            return -1;
        }
        else {
            return  1;
        }
    }

    public boolean equals(Rectangle r){
        if(r.getArea() == this.getArea()){
            return true;
        }
        else {
            return false;
        }
    }
}
