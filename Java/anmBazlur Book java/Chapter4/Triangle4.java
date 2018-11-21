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
public class Triangle4 {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int counter=1,rows,space;
        rows=in.nextInt();
        space=rows;
       for(int i=0;i<rows;i++){
           for(int j=space;j>0;j--){
               System.out.print(" ");
           }
           for(int k=0;k<counter;k++){
               System.out.print("#");
           }
           counter++;
           space--;
           System.out.println();
       }
}
}

    
