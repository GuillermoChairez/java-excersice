package com.company;

import com.company.Chapter12.Exersice1.Exerscie4.Loan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;

        do {
            try{
                System.out.println("Enter the amount, the years and the anual rate of the loan: ");
                Loan loan = new Loan(input.nextDouble(),input.nextInt(),input.nextDouble());
                System.out.println(loan.toString());
                ok = true;
            }
            catch(IllegalArgumentException e){
                System.out.println(e);
                input.nextLine();
            }
        } while (!ok);

    }
}
