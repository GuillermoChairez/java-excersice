package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList <Integer>();
        int number;

        for(int i = 0; i < 10; i++){
            number =(int)(Math.random() * (15));
            ints.add(number);
            System.out.print(number + " ");
        }
        shuffle(ints);
        System.out.println("");

        for(int i = 0; i < 10; i++){
            System.out.print(ints.get(i) + " ");
        }


    }

    public static void shuffle(ArrayList<Integer> list){
        int random;
        Integer temp;
        for(int  i = 0; i < list.size(); i++) {
            random =(int)(Math.random() * (list.size()));
            temp = list.get(i);
            list.set(i,list.get(random));
            list.set(random,temp);
        }
    }
}
