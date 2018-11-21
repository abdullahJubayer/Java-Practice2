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
class circle{
    double radius;
     String color;
    circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public circle(){
        this.color="Rrrred";
        this.radius=1.0;
    }
    double get_area(){
       //  System.out.println("super class method:circle");
        return radius*radius*Math.PI;
    }
}
class _170 extends circle{
    private double height;
    _170(double height){
        this.height=height;
    }
    _170(double radius,String name,double height){
        super(radius,name);
        this.height=height;
    }
    @Override
    double get_area(){
             //System.out.println("super class method:"+super.get_area());
        return super.get_area()*height; 
    }
    public static void main(String a[]){
        _170 obj=new _170(2.0);
        //System.out.println(obj.get_area());
              System.out.println(obj.get_area());
              // System.out.println("Cylender area is:"+obj.cylender_area());
    }
    
}
