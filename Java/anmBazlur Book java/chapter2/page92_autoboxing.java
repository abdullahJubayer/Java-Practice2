/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author jubayer
 */
class Test{
    void autoboxing(int n){
        Integer M;
        M=n;
        System.out.println("this convertion maid primitive to reference and its called "
                + "Autoboxing and its value:"+M);
    }
    
}
public class page92_autoboxing {
    public static void main(String ar[]){
        int b=10;
        Test JJ=new Test();
        JJ.autoboxing(b);
    }
    
}
