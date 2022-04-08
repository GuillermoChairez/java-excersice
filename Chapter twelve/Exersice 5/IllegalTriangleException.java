package com.company.Chapter12.Exersice1.Exersice5;

public class IllegalTriangleException extends Exception{
    private double wrongSide;
    public IllegalTriangleException(double wrongSide){
        super("Illegal side " + wrongSide + ".It must be less than the sum of the other sides");
        this.wrongSide = wrongSide;
    }

    public double getWrongSide(){
        return wrongSide;
    }
}
