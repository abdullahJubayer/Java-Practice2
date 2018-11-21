/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h_java;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class tostring {
    public static void main(String ar[]){
           Scanner in = new Scanner(System.in);
   int n = in .nextInt();
    in.close();
    String s="abd";
        //s=String.valueOf(n);

   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
    }
}
