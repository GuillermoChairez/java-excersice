package com.company.Exersice3;

import java.util.Date;
public class Account{
	private int id;
	double balanced;
	static private double annualInterestRate;
	private Date dateCreated;

	public Account(){
		dateCreated = new Date();
	}

	public Account(int id, double balanced){
		this.id = id;
		this.balanced = balanced;
		dateCreated = new Date();
	}

	void setId(int id){
		this.id = id;
	}

	void setBalance(double balance){
		this.balanced = balance;
	}

	void setAnnualInteresRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate/100;
	}

	int getId(){
		return id;
	}

	double getBalance(){
		return balanced;
	}

	double getAnnualInteresRate(){
		return annualInterestRate;
	}

	double getMonthlyInteres(){
		return balanced*(annualInterestRate/12);
	}

	Date getDateCreated(){
		return dateCreated;
	}

	void deposite(double amount){
		balanced += amount;
	}

	void withdraw(double amount){
		balanced -= amount;
	}

	double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", balanced=" + balanced +
				", dateCreated=" + dateCreated +
				'}';
	}
}