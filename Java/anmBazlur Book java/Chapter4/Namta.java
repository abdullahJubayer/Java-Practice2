/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author jubayer
 */
import java.util.Scanner;
public class Namta {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}
