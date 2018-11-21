/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Encapsulation;
import Encapsulation.NestedClass;
/**
 *
 * @author abdullah
 */
public class nested_class extends NestedClass{
    public void printAll() {
        NestedClass obj=new NestedClass();
        NestedClass.Inner obj1=new NestedClass.Inner(); 
        obj1.printInner();
        System.out.println("\n\n");
        obj.print();
    }
    public static void main(String[] args) {
        nested_class obj=new nested_class();
        obj.printAll();
    }
}
