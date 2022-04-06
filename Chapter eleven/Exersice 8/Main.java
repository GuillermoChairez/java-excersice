package com.company;

import com.company.Exersice4.Arrays;
import com.company.Exersice6.Loan;
import com.company.Exersice8.Account;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account a1 = new Account("George",1122,1000);
        a1.setAnnualInteresRate(1.5);

        a1.deposite(30,"Loan");
        a1.deposite(40,"birthday gift");
        a1.deposite(50,"Anything");
        a1.withdraw(5,null);
        a1.withdraw(4,null);
        a1.withdraw(2,null);

        System.out.println(a1.toString());
    }
}
