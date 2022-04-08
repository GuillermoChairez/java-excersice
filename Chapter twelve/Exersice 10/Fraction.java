package com.company.Chapter12.Exersice1.Exersice7;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() throws NullDenominatorException {
        this(1,1);
    }

    public Fraction(int numerator, int denominator) throws NullDenominatorException{
        setDenominator(denominator);
        setNumerator(numerator);
    }

    public Fraction(int numerator) throws NullDenominatorException{
        throw new NullDenominatorException("The denominator can not be null");
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
        if(denominator == 0){
            throw new NullDenominatorException();
        }
        else {
            this.denominator = denominator;
        }
    }
}
