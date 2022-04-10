package com.company;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.Chapter13.Exersice1.GeometricObject;
import com.company.Chapter13.Exersice1.IllegalTriangleException;
import com.company.Chapter13.Exersice1.Triangle;

public class Main {

    public static void main(String[] args) {
       ArrayList<Integer> integers = new ArrayList<Integer>();
       ArrayList<Number> numbers = new ArrayList<Number>();
       int number;
       for(int i = 0; i < 15; i++){
           number = (int)(Math.random()*10);
           System.out.print(number + " ");
           integers.add(number);
       }
       average(integers);
        for(int i = 0; i < integers.size(); i++){
           System.out.println("Average is " + integers.remove(i));
       }
        System.out.println("");
        for(int i = 0; i < 15; i++){
            number = (int)(Math.random()*10);
            System.out.print(number + " ");
            numbers.add(number);
        }
        sort(numbers);
        System.out.println("");
        for(int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }


    }

    public static void average(ArrayList<Integer> list){
        int sum = 0;
        int size = list.size();

       for(int i = size - 1; i >= 0; i--){
            sum += list.remove(i);
        }

        list.add(sum/size);
    }

    public static void sort(ArrayList<Number> list){
        int size = list.size();

        Number temp = list.get(0);

        for (int j = 0; j < size; j++) {
            temp = list.get(0);
            for (int i = 0; i < size;i++){
                if(temp.doubleValue() > list.get(i).doubleValue()){
                    list.set(i-1, list.get(i));
                    list.set(i,temp);
                }
                temp = list.get(i);
            }
        }

    }
}
