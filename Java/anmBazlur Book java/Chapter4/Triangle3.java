/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author jubayer
 */
import java.util.Scanner;
public class Triangle3 {
    public static void main(String ar[]){
        int counter=10,space=1;
     for(int k=counter;k>0;k--){
        for(int i=0;i<=space;i++){
           System.out.print(" "); 
        }
        for(int j=0;j<counter;j++){
            System.out.print("#");
        }
        space++;
        counter--;
        System.out.println();
}
}
}