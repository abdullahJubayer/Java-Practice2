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
public class REverse_Number {
            public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter any Numbers:");
         int m=in.nextInt();
         int sum=0;
         int temp=m;
         while(temp!=0){
        int r=temp%10;
        sum=sum*10+r;
             temp=temp/10;
        }    
                      System.out.print(sum);
                System.out.println();
    }
}
