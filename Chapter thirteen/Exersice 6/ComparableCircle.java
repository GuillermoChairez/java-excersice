package com.company.Chapter13.Exersice6;

import com.company.Chapter13.Exersice5.Circle;
import com.company.Chapter13.Exersice5.Comparable;
import com.company.Chapter13.Exersice5.GeometricObject;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(){
        super();
    }

    public ComparableCircle(double radius){
        super(radius);
    }

    public GeometricObject compareTo(GeometricObject o){
        return max(o,new ComparableCircle(this.getRadius()));
    }
}
