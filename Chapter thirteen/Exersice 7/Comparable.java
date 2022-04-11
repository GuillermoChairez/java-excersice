package com.company.Chapter13.Exersice7;

public interface Comparable {
    public static GeometricObject max(GeometricObject object1, GeometricObject object2){
        if(object1.getArea() > object2.getArea()){
            return object1;
        }
        return object2;
    }
}
