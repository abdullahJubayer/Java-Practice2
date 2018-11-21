/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h_java;

/**
 *
 * @author abdullah
 */
public class Year {
    Year(int n){
        if(n==0){
            System.out.println("Saturday");
        }
        else if(n==1){
            System.out.println("Sunday");
        }
       else if(n==2){
            System.out.println("Monday");
       }
       else if(n==3){
            System.out.println("Tuesday");
       }
       else if(n==4){
            System.out.println("wednasday");
       }
       else if(n==5){
            System.out.println("Thursday");
       }
       else if(n==6){
            System.out.println("Friday");
       }
    }
}
