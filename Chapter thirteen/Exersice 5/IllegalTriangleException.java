package com.company.Chapter13.Exersice5;

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
