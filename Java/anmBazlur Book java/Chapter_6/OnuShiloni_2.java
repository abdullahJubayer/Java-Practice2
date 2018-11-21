/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_6;

import java.text.DecimalFormat;

/**
 *
 * @author jubayer
 */
public class OnuShiloni_2 {
    double circle(double radius){
        return Math.PI*(radius*radius);
    }
    double triangle(double base,double height){
        return 0.5*base*height;
    }
    double Rectangle(double length,double width){
        return length*width;
    }
    double Cyliender(double radius,int height){
        return 2*Math.PI*radius*height+(2*Math.PI*(radius*radius));
    }
        private static final DecimalFormat f2 = new DecimalFormat(".##");
    public static void main(String ar[]){
        OnuShiloni_2 Obj=new OnuShiloni_2();
        System.out.println("area of Circle is: "+f2.format(Obj.circle(5)));
        System.out.println("area of Triangle is: "+Obj.triangle(2, 3));
        System.out.println("area of Rectangle is: "+Obj.Rectangle(4, 3));
        System.out.println("area of Cylender is: "+f2.format(Obj.Cyliender(2, 5)));
    }
}
