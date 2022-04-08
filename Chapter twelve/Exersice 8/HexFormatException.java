package com.company.Chapter12.Exersice1.Exersice8;

public class HexFormatException extends Exception{
    private char invalidValue;

    public HexFormatException(char invalidValue){
        super(invalidValue + " is not a Hexadecimal value");
        this.invalidValue = invalidValue;
    }

    public char getInvalidValue(){
        return invalidValue;
    }
}
