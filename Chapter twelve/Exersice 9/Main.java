package com.company;

import com.company.Chapter12.Exersice1.Exersice8.HexFormatException;
import com.company.Chapter12.Exersice1.Exersice9.BinaryFormatException;

import java.util.Scanner;

import static com.company.Chapter12.Exersice1.Exersice6.Hex2Dec.hexToDecimal;
import static com.company.Chapter12.Exersice1.Exersice9.Bin2Dec.binary2Decimal;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        do {
            System.out.print("Enter a binary number: ");
            try {
                String binary = input.nextLine();
                System.out.println("The decimal value for binary number "
                        + binary + " is " + binary2Decimal(binary.toUpperCase()));
                ok = true;
            } catch (BinaryFormatException e) {
                System.out.println(e);
            }
        } while (!ok);

    }
}
