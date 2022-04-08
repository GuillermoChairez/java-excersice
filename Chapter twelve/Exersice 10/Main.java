package com.company;
import java.util.Scanner;

import com.company.Chapter12.Exersice1.Exersice7.Fraction;
import com.company.Chapter12.Exersice1.Exersice7.NullDenominatorException;
import com.company.Chapter12.Exersice1.Exersice9.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        Fraction fraction;
        do {
            System.out.print("Enter the numerator and denominator of a fraction: ");
            try {
                fraction = new Fraction(input.nextInt());
                ok = true;
            } catch (NullDenominatorException e) {
                System.out.println(e);
            }
        } while (!ok);

    }
}
