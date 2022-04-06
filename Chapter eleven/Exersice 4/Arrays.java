package com.company.Exersice4;

import java.util.ArrayList;

public class Arrays{

    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty()){
            return null;
        }
        Integer maximum = 0;
        for (Integer i: list){
            if(i > maximum){
                maximum = i;
            }
        }
        return maximum;
    }
}
