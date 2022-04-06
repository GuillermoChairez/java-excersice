package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] row = {0,0};
        int[] column = {0,0};
        System.out.println("Enter the array size n: ");
        int n = input.nextInt();
        int [][] array = new int[n][n];

        System.out.println("The random array is");
        for(int i = 0; i < n; i ++){
            for (int j= 0; j < n;j++){
                array[i][j]= (int)((Math.random()*5))%2;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("");
        }

        int onesR = 0;
        int onesC = 0;
        for(int i = 0; i < n; i ++){
            for (int j= 0; j < n;j++){
                if(array[i][j] == 1){
                    onesR++;
                }
                if(array[j][i] == 1){
                    onesC++;
                }
            }
            if(onesR > row[1]){
                row[0] = i;
                row[1] = onesR;
            }
            if(onesC > column[1]){
                column[0] = i;
                column[1] = onesC;
            }
            onesC = 0;
            onesR = 0;
        }

        System.out.println("The largest row index: " + row[0]);
        System.out.println("The largest column index: " + column[0]);
    }
}
