
package problem_1;

import java.util.Scanner;

public class _6_part2 {
    
    public static void main(String[] args) {
         Scanner inScanner=new Scanner(System.in);
        int []val=new int[5];
        int n=inScanner.nextInt();
        for(int j=0;j<n;j++){
                    for(int i=0;i<val.length;i++){
            val[i]=inScanner.nextInt();
        }
            if(val[0]<val[1]){
                if (val[0]<val[2]) {
                    if(val[0]<val[3]){
                        if (val[0]<val[4]) {
                            System.out.println("Minimum Number is : "+val[0]);
                        }
                        else{
                            System.out.println("Minimum Number is : "+val[4]);
                        }
                    }
                    else{
                        if(val[3]<val[4]){
                            System.out.println("Minium Number is : "+val[3]);
                        }
                        else{
                            System.out.println("Minimum Number is : "+val[4]);
                        }
                    }
                    
                }
                else{
                    if(val[2]<val[3]){
                        if(val[2]<val[4]){
                            System.out.println("Minimum Number is : "+val[2]);
                        }
                        else{
                            System.out.println("Minimum Number is : "+val[4]);
                        }
                    }
                    else{
                        if(val[3]<val[4]){
                            System.out.println("Minimum Number is : "+val[3]);
                        }
                        else{
                            System.out.println("Minimum Number is : "+val[4]);
                        }
                    }
                }
 
            }
            else{
                if (val[1]<val[2]) {
                    if(val[1]<val[3]){
                        if(val[1]<val[4]){
                            System.out.println("Minimum Number is : "+val[1]);
                        }
                        else{
                            System.out.println("Minimum Number is : "+val[4]);
                        }
                    }
                    else{
                        if(val[3]<val[4]){
                            System.out.println("Minimum Number is : "+val[3]);
                        }
                        else{
                            System.out.println("Minimum Number is : "+val[4]);
                        }
                    }
                }
                else{
                    if(val[2]<val[3]){
                       if(val[2]<val[4]){
                           System.out.println("Minimum Number is : "+val[2]);
                       }
                       else{
                           System.out.println("Minimum Number isl : "+val[4]);
                       }
                    }
                    else{
                        if(val[3]<val[4]){
                            System.out.println("Minimum Number is : "+val[3]);
                        }
                        else{
                            System.out.println("Minimum Number is :"+val[4]);
                        }
                    }
                }
            }
    }
    }
}
