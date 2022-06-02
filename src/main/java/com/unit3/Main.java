package com.unit3;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {

static void main() {
    
    Rectangle rectangle1 = new Rectangle(4,40);
    Rectangle rectangle2 = new Rectangle(3.5,5);
    System.out.println("This program creates two rectangle objects and displays their width, height," +
    "\n" +  "area and perimeter." + "\n");
    System.out.println("Rectangle 1:");
    System.out.println("heigth = " + String.format("%.2f", rectangle1.getHeight()));
    System.out.println("width = " + String.format("%.2f", rectangle1.getWidth()));
    System.out.println("area = " + String.format("%.2f", rectangle1.getArea()));
    System.out.println("perimeter = " + String.format("%.2f", rectangle1.getPerimeter()));
    System.out.println("\n");


    System.out.println("Rectangle 2:");
    System.out.println("heigth = " + String.format("%.2f", rectangle2.getHeight()));
    System.out.println("width = " + String.format("%.2f", rectangle2.getWidth()));
    System.out.println("area = " + String.format("%.2f", rectangle2.getArea()));
    System.out.println("perimeter = " + String.format("%.2f", rectangle2.getPerimeter()));
    System.out.println("\n");

    System.out.println("Goodbye...");
}



    public static void main( String[] args )
    {
       
        main();
 
    }
}
