/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jubayer
 */
public class Day_8 {
     public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer>Ob=new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            Ob.put(name,phone);
            //System.out.print(Ob.keySet());
            //System.out.println(Ob.values());
        }
       while(in.hasNext()){
            String s = in.next();
            // Write code here
            
           // System.out.print(Ob.get(s));
            if (Ob.get(s)==null){
                System.out.println("Not found");
            }
            else{
                System.out.println(s+"="+Ob.get(s));
            }
        }
        in.close();
    }
}
