package org.launchcode.java.studios;

import sun.font.TrueTypeFont;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    static float PI = (float)3.14;
    public static void main(String[] args){
        boolean contnue = false;
        do {
            Scanner reader = new Scanner(System.in);
            try {
                System.out.print("Please enter the radius of the circle : ");
                float radius = reader.nextFloat();
                float area = PI * radius * radius;
                System.out.println("The area of a circle of radius " + area + " is: " + area);
                contnue = false;
            }
            catch(InputMismatchException e){
                contnue = true;
                System.out.println("Incorrect input, the radius should be an integer or float .. Please try again!");
            }
        } while(contnue);
    }
}
