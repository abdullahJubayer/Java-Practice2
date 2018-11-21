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
public class For_Each_Loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name[] = new String[5];
        //Input
        for (int i=0;i<name.length;i++) {
            name[i] = in.nextLine();
        }
        System.out.println("\n\n");
        
        //Output by For enhanced Loop
        for(String x : name){
            System.out.println(x);
        }

    }
}
