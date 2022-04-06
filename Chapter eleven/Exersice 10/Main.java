package com.company;

import com.company.Exersice10.MyStack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();
        System.out.println("Enter five Strings: ");
        for(int i = 0; i < 5; i++){
            stack.add(input.next());
        }
        while(!stack.isEmpty()){
            System.out.println(stack.remove(stack.size()-1));
        }
    }
}
