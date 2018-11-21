/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author jubayer
 */
import java.text.DecimalFormat;
class circle{
    private int radius;
    void circle(int radius){
        this.radius=radius;
    }
    double get_circle(){
        return radius*radius*Math.PI;
    }
}
public class page75_non_static_method {
    	private static DecimalFormat b = new DecimalFormat(".##");
    public static void main(String sr[]){
      circle obj=new circle();
            obj.circle(5);
            double n=obj.get_circle();
            System.out.println(n);
            System.out.println(b.format(n));
    }
}
