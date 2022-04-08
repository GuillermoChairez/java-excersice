package com.company.Chapter12.Exersice1.Exersice9;

public class Bin2Dec {
    public static int binary2Decimal(String binary) throws BinaryFormatException{
        int decimalValue = 0;

        for(int i = 0; i < binary.length();i ++){
            decimalValue = decimalValue*2 + binCharToDecimal(binary.charAt(i)) ;
        }
        return decimalValue;

    }

    public static int binCharToDecimal(char bit) throws BinaryFormatException{
        if (bit == '0' || bit == '1'){
            return bit - '0';
        }
        else{
            throw new BinaryFormatException(bit);
        }

    }
}
