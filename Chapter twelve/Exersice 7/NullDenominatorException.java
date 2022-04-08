package com.company.Chapter12.Exersice1.Exersice7;

public class NullDenominatorException extends Exception{
    NullDenominatorException(){
        super("Denominator can not be zero");
    }
}
