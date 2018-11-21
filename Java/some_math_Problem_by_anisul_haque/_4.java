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
public class _4 {
    public static void main(String[] args) {
        Scanner inScanner=new Scanner(System.in);
        int n=inScanner.nextInt();
        int val = 0;
        for(int i=0;i<n;i++){
            int x=inScanner.nextInt();
            int y=inScanner.nextInt();
            int z=inScanner.nextInt();
            
            val=x*y*z; 
            System.out.println(val);
        }
        
        
    }
}
