package com.company.Chapter12.Exersice1.Exersice6;

import com.company.Chapter12.Exersice1.Exersice8.HexFormatException;

import java.util.Scanner;

public class Hex2Dec {

     public static int hexToDecimal(String hex) throws HexFormatException{
         int decimalValue = 0;
         for (int i = 0; i < hex.length(); i++) {
             char hexChar = hex.charAt(i);
             decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
     }

     public static int hexCharToDecimal(char ch) throws HexFormatException{
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if(ch >= '0' && ch <='9')
            return ch - '0';
        else
            throw new HexFormatException(ch);
     }
}
