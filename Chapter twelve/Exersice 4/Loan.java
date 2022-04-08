package com.company.Chapter12.Exersice1.Exerscie4;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** No-arg constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /** Construct a loan with specified annual interest rate,
     number of years, and loan amount
     */
    public Loan(double loanAmount, int numberOfYears,
                double annualInterestRate) throws IllegalArgumentException{
        setLoanAmount(loanAmount);
        setNumberOfYears(numberOfYears);
        setAnnualInterestRate(annualInterestRate);
        loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate (double annualInterestRate) throws IllegalArgumentException {
        if (annualInterestRate > 0){
            this.annualInterestRate = annualInterestRate;
        }
        else {
            throw new IllegalArgumentException("annual interest rate must to be greater than zero");
        }
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears  > 0){
            this.numberOfYears = numberOfYears;
        }
        else {
            throw new IllegalArgumentException("The number of years must to be greater than zero");
        }

    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Set a newloanAmount */
    public void setLoanAmount(double loanAmount) throws IllegalArgumentException{
        if (loanAmount > 0){
            this.loanAmount = loanAmount;
        }
        else{
            throw new IllegalArgumentException("The loan amount must to be greater than zero");
        }

    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "annualInterestRate=" + annualInterestRate +
                ", numberOfYears=" + numberOfYears +
                ", loanAmount=" + loanAmount +
                ", loanDate=" + loanDate +
                '}';
    }
}
