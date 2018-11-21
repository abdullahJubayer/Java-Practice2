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
class Dog{
    public String get_name(){
        System.out.println("Normal Dog");
        return "Normal Dog";
    }
}
class Desi_Dog extends Dog{
    @Override
    public String get_name(){
        
    System.out.println("Desi Dog");
       return  "Desi Dog";
    }
}
class Be_dog extends Dog{
    public static int v;
    @Override
    public String get_name(){
        System.out.println("Bedisi Dog");
        return "Bedisi Dog";
    }
    public String get(){
        return "fuck";
    }
}
public class _183 {
    public static void main(String ar[]){
        Dog dog=new Dog();
        Dog dog1=new Desi_Dog();
        Dog dog2=new Be_dog();
        dog.get_name();
        dog1.get_name();
        dog2.get_name();
        Be_dog dog3= (Be_dog) dog2;
        System.out.println(dog3.get());
        
        
    }
}
