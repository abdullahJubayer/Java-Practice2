
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdullah
 */
public class Sum_Number {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            
            int m=in.nextInt();
            if(m!=0){
                count++;
            }
        }
        System.out.println(count);
        
       
    }
    
}
