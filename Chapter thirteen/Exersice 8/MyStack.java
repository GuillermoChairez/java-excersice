package com.company.Chapter13.Exersice8;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public MyStack(){

    }

    public MyStack(MyStack that){
        this.list = new ArrayList<Object>(that.list);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
 }

