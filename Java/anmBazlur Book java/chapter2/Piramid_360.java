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
public class Piramid_360 {
    public static void main(String ar[]){
        int i,j,k,n,row,m;
        Scanner in=new Scanner(System.in);
        row=in.nextInt();
        m=row;
        n=1;
        for(i=1;i<=row;i++){
            for(j=1;j<=n;j++){
                System.out.print(" ");
            }
            n++;
            for(k=m;k>0;k--){
                System.out.print("* ");
            }
            m--;
            System.out.println();
        }
    }
}
