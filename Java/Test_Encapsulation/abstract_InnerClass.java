/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Encapsulation;

import Encapsulation.Abstract_InnerClass;

/**
 *
 * @author abdullah
 */
public class abstract_InnerClass{
    public static void main(String[] args) {
        new Abstract_InnerClass() {
            @Override
            public void print_name() {
                System.out.println("Abdullah jubayer");
            }
        }.print_name();
        new Abstract_InnerClass() {
            @Override
            public void print_name() {
                System.out.println("Mehadi Hasan");
            }
        }.print_name();
    }
}
