package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April",
        "May", "June","July", "August", "September", "October",
        "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println("Enter a number between 1 and 12 ");
        try {
            int index = input.nextInt();
            System.out.println(months[index -1] + " " +dom[index-1]);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            
        }
}
}
