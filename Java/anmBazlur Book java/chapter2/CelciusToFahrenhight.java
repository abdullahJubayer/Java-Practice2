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
public class CelciusToFahrenhight {
  public static void main(String ar[]){
     double celsius,fahrenhight; 
     Scanner in=new Scanner(System.in);
     celsius=in.nextDouble();
     fahrenhight=9.0/5.0*celsius+32.0;
     System.out.println("fahrenhight="+fahrenhight);
  }  
}
