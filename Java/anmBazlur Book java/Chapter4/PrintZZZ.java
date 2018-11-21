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
public class PrintZZZ {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int values=in.nextInt();
        for(int i=0;i<values;i++){
            System.out.print("#");
        }
        int   space=1;
        for(int r=0;r<values;r++){
           for(int j=1;j<space;j++){
               System.out.print(" ");
           }
           System.out.print("#");
           space++;
           System.out.println();
        }
        for(int k=0;k<values;k++){
            System.out.print("#");
        }
    }
    
}
