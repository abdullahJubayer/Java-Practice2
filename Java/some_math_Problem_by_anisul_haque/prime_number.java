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
public class prime_number {

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int r=0;
        int n = inScanner.nextInt();
        for(int i=2;i<n;i++){
            
            int m=0;
            for(int j=i;j>=1;j--){
                if(i%j==0){
                    m=m+1;
                }
            }
            if(m==2){
           r=r+1;
        }
        }
        
        System.out.println(r);
        
    }
}
