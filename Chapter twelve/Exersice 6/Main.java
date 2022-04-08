package com.company;

import java.util.Scanner;

import static com.company.Chapter12.Exersice1.Exersice6.Hex2Dec.hexToDecimal;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        do {
            System.out.print("Enter a hex number: ");
            try {
                String hex = input.nextLine();
                System.out.println("The decimal value for hex number "
                        + hex + " is " + hexToDecimal(hex.toUpperCase()));
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } while (!ok);

    }
}
