package com.company.Chapter12.Exersice1.Exersice5;

import java.util.Date;

public class GeometricObject {
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

}
