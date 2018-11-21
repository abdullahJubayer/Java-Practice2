
package problem_1;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class Max_and_minimum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] number=new int[5];
        for(int i=0;i<n;i++){
            
            for(int j=0;j<number.length;j++){
                number[j]=in.nextInt();
            }
            int max=number[0];
            int min=number[0];
            
            for(int k=1;k<number.length;k++){
                if(max<number[k]){
                    max=number[k];
                }
                if(min>number[k]){
                    min=number[k];
                }
            }
            System.out.println("Max: "+max);
            System.out.println("Min: "+min);
            System.out.println();
        }
    }
}
