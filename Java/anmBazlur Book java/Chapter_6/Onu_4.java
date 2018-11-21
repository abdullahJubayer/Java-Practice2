/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_6;

/**
 *
 * @author jubayer
 */
class Animel{
    
}
class Horse extends Animel{
}
public class Onu_4 {
    public void doSomething(Animel animel){ 
        System.out.println("Inside Animel");
    }
    public void doSomething(Horse horse){
        System.out.println("inside Horse");
    }
    public static void main(String ar[]){
        Animel Obj=new Horse();
        Onu_4 Obj1=new Onu_4();
        Obj1.doSomething(Obj);
    }
}
