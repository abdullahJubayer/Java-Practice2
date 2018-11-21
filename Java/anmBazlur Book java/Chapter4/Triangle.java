/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jubayer
 */
import java.util.Scanner;
public class Triangle {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int rows=in.nextInt();
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    
}
