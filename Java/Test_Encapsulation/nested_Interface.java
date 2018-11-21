/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Encapsulation;

import Encapsulation.Nested_Interface;

/**
 *
 * @author abdullah
 */
public class nested_Interface implements Nested_Interface.Inner{

    @Override
    public void print() {
        System.out.println("Abdullah jubayer");
    }
    public static void main(String[] args) {
        nested_Interface obj=new nested_Interface();
        obj.print();
    }
}
