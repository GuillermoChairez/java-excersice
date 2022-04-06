package com.company.Exersice3;

public class CheckingAccount extends Account{
    public CheckingAccount(int id, double balance){
        super(id,balance);
    }


    public void withdraw(double amount){
        if(amount <= balanced){
            balanced -= amount;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balanced=" + balanced +
                '}';
    }
}
