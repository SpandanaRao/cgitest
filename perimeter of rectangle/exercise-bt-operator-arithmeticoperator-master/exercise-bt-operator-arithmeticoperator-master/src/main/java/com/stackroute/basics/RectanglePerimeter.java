package com.stackroute.basics;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
    	try (Scanner in = new Scanner(System.in)) {
			double l=in.nextDouble();
			double b=in.nextDouble();
			double peri=perimeterCalculator(l,b);
			System.out.println(peri);
		}
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
    	double per=2*(length+breadth);
        return per;
    }
}