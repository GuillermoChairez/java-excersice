package com.company;

public class Main {

    public static void main(String[] args) {
        Tax t1 = Tax.SINGLE_FILER;
        Tax t2 = Tax.MARRIED_JOINTLY_OR_QUALIFYNG_WIDOW;
        Tax t3 = Tax.MARRIED_SEPERATLEY;
        Tax t4 = Tax.HEAD_OF_HOUSEHOLD;

        Tax[] taxes = {t1,t2,t3,t4};

        System.out.println(" Single filers    Married jointly     Married separately      head of household");
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < taxes.length; i++) {
                System.out.format("          %.2f", taxes[i].getTax());
                taxes[i].setTaxableIncome(taxes[i].getTaxableIncome() + 1000);
            }
            System.out.println("");
        }
	// write your code here
    }
}
