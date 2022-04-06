package com.company;

import com.company.Exersice4.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a bunch of integers and end with 0 ");

        while(true){
            list.add(input.nextInt());
            if (list.contains(0)){
                break;
            }
        }

        System.out.println("The maximu value is " + Arrays.max(list));

    }
}
