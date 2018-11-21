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
public class Problem_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n,i=0;
        int m,k=0,l=0;
        n=in.nextInt();
        while(i<n){
         m=in.nextInt();
         if(m>=0){
           k=k+1;
         }
         if(m<0){
             l=l+1;
         }
        i++;
        }
        System.out.println(k+" "+l);
    }
    
}
