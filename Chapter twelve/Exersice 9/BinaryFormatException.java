package com.company.Chapter12.Exersice1.Exersice9;

public class BinaryFormatException extends Exception{

    public BinaryFormatException(char wrongValue){
        super(wrongValue + " is not a binary value");
    }
}
