/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author jubayer
 */
public class Day_7 {
    public static void main(String at[]){
        int n;
        Scanner Obj=new Scanner(System.in);
        n=Obj.nextInt();
        int [] v=new int[n];
        for(int i=0;i<v.length;i++){
            v[i]=Obj.nextInt();
        }
        for(int i=(v.length-1);i>=0;i--){
            System.out.print(v[i]+" ");
        }
    }
}
