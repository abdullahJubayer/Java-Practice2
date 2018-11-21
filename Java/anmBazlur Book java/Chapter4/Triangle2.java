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
public class Triangle2 {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int counter=in.nextInt();
        int rows=in.nextInt();
        for(int i=0;i<=rows;i++){
            for(int j=0;j<counter;j++){
                System.out.print("# ");
            }counter--;
            System.out.println();
        }
    }
    
}
