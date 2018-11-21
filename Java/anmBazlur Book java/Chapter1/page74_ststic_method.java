/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author jubayer
 */
class Test{
    public static int squar(int n){
        return n*n;
    }
}
public class page74_ststic_method {
    public static void main(String ar[]){
        int value=5;
        int square=Test.squar(value);
        System.out.println(square);
    }
}
