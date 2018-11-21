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
public class BodyMasss13 {
   public static void main(String ar[]){
       double weight,hight,MBI;
       Scanner in=new Scanner(System.in);
       weight=in.nextDouble();
       hight=in.nextDouble();
      MBI=weight/(hight*hight); 
      System.out.println(MBI);
   } 
}
