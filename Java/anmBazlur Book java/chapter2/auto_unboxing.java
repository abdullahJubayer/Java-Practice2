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
class Test1{
    void autounboxinga(Integer n){
        int a;
        a=n;
        System.out.println("this conversion maid reference to premitive and its called"
                + "autounboxing and its value is:"+a);
    }
}
public class auto_unboxing {
    public static void main(String ar[]){
        Integer b=5;
        Test1 OO=new Test1();
        OO.autounboxinga(b);
    }
}
