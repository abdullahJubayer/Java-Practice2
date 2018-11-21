/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author jubayer
 */
import java.util.Scanner;
public class Print_Rectangle {
    public static void main(String ar[]){
        int i,j,k,l,no,n;
        Scanner oj=new Scanner(System.in);
        no=oj.nextInt();
        n=no;
        for(l=0;l<=no;l++){
         for(i=1;i<=n;i++){
             System.out.print(" ");
         }
         n--;
         for(j=0;j<l;j++){
             System.out.print("* ");
         }
             System.out.println();
    }
    
}
}