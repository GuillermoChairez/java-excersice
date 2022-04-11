package com.company.Chapter13.Exersice7;

import java.util.Date;

public abstract class GeometricObject implements Comparable,Colorable {
    private String color = "green";
    private boolean filled;
    private Date dateCreated;

    GeometricObject(){
        this.dateCreated = new Date();
    }

    GeometricObject(String color, boolean filled){
        this.dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public static GeometricObject max(GeometricObject object1, GeometricObject object2) {
        if(object1.getArea() > object2.getArea()){
            return object1;
        }
        return object2;
    }

}
