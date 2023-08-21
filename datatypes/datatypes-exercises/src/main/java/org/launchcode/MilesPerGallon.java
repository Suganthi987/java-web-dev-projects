package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        System.out.println("Enter your miles");
        Scanner inputmiles = new Scanner(System.in);
        float miles = inputmiles.nextFloat();
        System.out.println("Enter the amount of gallons");
        Scanner inputgallons = new Scanner(System.in);
        float gallons = inputgallons.nextFloat();
        float milespergallons = miles/gallons;
        System.out.println("Your miles per gallons: "+milespergallons);
    }
}
