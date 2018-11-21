/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Encapsulation;

import Encapsulation.Interface_in_a_Class;

/**
 *
 * @author abdullah
 */
public class interface_ina_class extends Interface_in_a_Class{
    void pp(){
        Interface_in_a_Class.Inn obj=new Interface_in_a_Class.Inn() {
            @Override
            public void print_Abdullah() {
                System.out.println("Abdullah jubayer");
            }

            @Override
            public void print_Mehadi() {
                System.out.println("Mehadi Hasan");
            }
        };
        obj.print_Abdullah();
        obj.print_Mehadi();
    }
    public static void main(String[] args) {
        interface_ina_class obj=new interface_ina_class();
        obj.pp();
    }
}
