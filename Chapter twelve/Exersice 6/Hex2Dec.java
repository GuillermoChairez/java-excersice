package com.company.Chapter12.Exersice1.Exersice6;

import java.util.Scanner;

public class Hex2Dec {

     public static int hexToDecimal(String hex) throws NumberFormatException{
         int decimalValue = 0;
         for (int i = 0; i < hex.length(); i++) {
             char hexChar = hex.charAt(i);
             decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
     }

     public static int hexCharToDecimal(char ch) throws NumberFormatException{
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if(ch >= '0' && ch <='9')
            return ch - '0';
        else
            throw new NumberFormatException(ch + " is not a Hexadecimal value");
     }
}
