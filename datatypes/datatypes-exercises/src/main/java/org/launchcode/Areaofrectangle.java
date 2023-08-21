package org.launchcode;
import java.util.Scanner;
public class Areaofrectangle {
    public static void main(String[] args){
        Scanner inputlen = new Scanner(System.in);
        Scanner inputbreadth = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = inputlen.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double breadth = inputbreadth.nextDouble();
        double area = length * breadth;
        System.out.println("The area of the rectangle: "+area);
    }
}
