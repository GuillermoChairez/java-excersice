package com.company.Chapter12.Exersice1.Exersice7;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction() throws NullDenominatorException {
        this(1,1);
    }

    Fraction(int numerator,int denominator) throws NullDenominatorException{
        setDenominator(denominator);
        setNumerator(numerator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator){
            this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator)  throws NullDenominatorException{
        if(numerator == 0){
            throw new NullDenominatorException();
        }
        else {
            this.denominator = denominator;
        }
    }
}
