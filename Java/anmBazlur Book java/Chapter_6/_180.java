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
class Shape{
    public String name;
    Shape(String name){
      this.name=name;
    }
    String get_name(){
        return name;
    }
}
class Circle extends Shape{
    Circle(){
        super("Circle");
    }
}
class Radius extends Shape{
    Radius(){
        super("Radius");
    }
}
class Drawing_Bord{
    void prin(Shape sh){
       System.out.println( sh.get_name());
    }
}
public class _180 {
    public static void main(String at[]){
        Drawing_Bord obj=new Drawing_Bord();
        Circle obj1=new Circle();
        Radius obj2=new Radius();
        obj.prin(obj1);
        obj.prin(obj2);
    }
}
