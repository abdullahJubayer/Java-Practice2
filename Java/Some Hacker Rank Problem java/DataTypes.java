/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerank;

import java.util.Scanner;

/**
 *
 * @author jubayer
 */
public class DataTypes {
    public static void main(String ar[]){

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tip = scan.nextInt(); // tip percentage
        int tax=scan.nextInt();
      
        // Write your calculation code here.
         double tip1=(mealCost*(tip))/100;
         double tax1= ( mealCost*tax)/100;
         
        //The java.lang.Math.round(float a) returns the closest int to the argument. 
        //sample
         float r=(float) 1.99999;
        System.out.println("Example of Math.round  "+Math.round(r));
        // cast the result of the rounding operation to an int and save it as totalCost 
        int Total=(int)Math.round(mealCost+tip1+tax1);
        // Print your result
        System.out.println("The total meal cost is "+Total+" dollars."); 

    }
}
