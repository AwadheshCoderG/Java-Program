package com.CoderG.Challenge77.utils;

import com.CoderG.Challenge77.geometry.Circle;
import com.CoderG.Challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(4.4);
        Rectangle rec = new Rectangle(10, 14);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double recArea = rec.length * rec.breadth;

        System.out.printf("Area of the circle is : %f , Area of the rectangle is : %f", cirArea, recArea);
    }
}
