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
public class _2D_Matrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[][] = new int[2][3];
        int B[][] = new int[2][3];
        //Strt Input
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" A[%d][%d]=",i,j);
                A[i][j] = in.nextInt();
            }
        }
        
                for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" B[%d][%d]=",i,j);
                B[i][j] = in.nextInt();
            }
        }//End Input
                
                
                //Start Output
        System.out.println("\n\n");
        //A Matrix
        System.out.print("A=");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+A[i][j]); 
            }
            System.out.println("\n");
        }
        System.out.println("\n\n");
        
        //B Matrix
        System.out.print("B=");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+A[i][j]); 
            }
            System.out.println("\n");
        }
        
        //A+B Matrix
                System.out.print("A+B=");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                //Just addition 2 Matrix like a+b
                System.out.print("\t"+(A[i][j]+B[i][j])); 
            }
            System.out.println("\n");
        }
        
    }
}
