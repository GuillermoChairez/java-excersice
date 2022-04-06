package com.company.Exersice8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private int id;
	private String name;
	private double balanced;
	private ArrayList transactions;
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

	public Account(String name, int id, double balanced){
		this.id = id;
		this.name = name;
		this.balanced = balanced;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}

	public void setId(int id){
		this.id = id;
	}

	public void setBalance(double balance){
		this.balanced = balance;
	}

	public void setAnnualInteresRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate/100;
	}

	public int getId(){
		return id;
	}

	public double getBalance(){
		return balanced;
	}

	public double getAnnualInteresRate(){
		return (annualInterestRate*100);
	}

	public double getMonthlyInteres(){
		return balanced*(annualInterestRate/12);
	}

	public Date getDateCreated(){
		return dateCreated;
	}

	public void deposite(double amount,String description){
		balanced += amount;
		if(description == null) {
			description = "No description";
		}
		transactions.add(new Transaction('D',amount,this.balanced,description));
	}

	public void withdraw(double amount,String description){
		balanced -= amount;
		if(description == null) {
			description = "No description";
		}
		transactions.add(new Transaction('W',amount,this.balanced,description));
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", name='" + name + '\'' +
				", balanced=" + balanced +
				", transactions=" + transactions +
				'}';
	}
}