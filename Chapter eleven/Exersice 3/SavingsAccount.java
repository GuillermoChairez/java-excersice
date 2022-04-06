package com.company.Exersice3;
import java.util.Date;

public class SavingsAccount extends Account{
    private int numberWithdraw = 0;
    private Date previousDate = new Date();
    private Date currentDate;

    public SavingsAccount(int id, double balance){
        super(id,balance);
    }

    public void withdraw(double amount){
        if(amount <= balanced && numberWithdraw <=3){
            balanced -= amount;
            numberWithdraw++;

            currentDate = new Date();
            if(previousDate.getMonth() != currentDate.getMonth()){
                numberWithdraw = 0;
                previousDate = currentDate;
            }

        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balanced=" + balanced +
                '}';
    }
}
