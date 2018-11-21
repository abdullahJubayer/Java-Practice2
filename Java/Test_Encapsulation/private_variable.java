/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Encapsulation;

import Encapsulation.Private_variable;

/**
 *
 * @author abdullah
 */
public class private_variable {
    public static void main(String[] args) {
        Private_variable obj=new Private_variable();
        
        obj.Atik="Atik";//it allowed hare because it is public
        obj.setNoman("Noman");//obj.Variable not Allowed hare because it is protected
                              //it is only possible in the same class
                              
        obj.setAbdullah("Abdullah");//obj.Variable not Allowed hare because it is private
                                    //it is only Possible in the same(Private_variable) class
        System.out.println(obj.getAtik());
        System.out.println(obj.getNoman());
        System.out.println(obj.getAbdullah());
    }
}
