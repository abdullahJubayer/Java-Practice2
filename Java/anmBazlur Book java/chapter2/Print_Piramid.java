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
public class Print_Piramid {
    public static void main(String ar[]){
        int i,j,k,m=6,n=1;
        for(k=m;k>0;k--){
        for(i=0;i<m;i++){
            System.out.print(" ");
        }
        for(j=0;j<n;j++){
            System.out.print("* ");
        }
        n++;
        System.out.println();
}
}
}

