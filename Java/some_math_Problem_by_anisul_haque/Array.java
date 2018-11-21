/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_1;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double sum=0;
        double ar[]=new double[5];
        for(int i=0;i<ar.length;i++){
           ar[i]=in.nextDouble();
           sum=sum+ar[i];//summation all ar[]
        }
        System.out.println("Summation of ar is: "+sum);
        double avg=sum/ar.length;
        System.out.println("Avarage of ar is: "+avg);
        
        
        //Maximum
        double max=ar[0];
        //Minimum
        double min=ar[0];
        
        for(int i=1;i<ar.length;i++){
            if(max<ar[i]){
                max=ar[i];
            }
            if(min>ar[i]){
                min=ar[i];
            }
        }
        System.out.println("Maximum is: "+max);
        System.out.println("Minimum is: "+min);
    }
}
