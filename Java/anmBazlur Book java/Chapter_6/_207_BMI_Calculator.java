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
class BMI{
    public static final double METER_PER_INCH=0.0254;
    String name;
    double Fit;
    double kg;
    BMI(String name,double Fit,double Kg){
        this.name=name;
        this.Fit=Fit;
        this.kg=Kg;
    }
    double get_BMI(){
       double inc=Fit*12.0;
         //System.out.println(Fit);
       double meter=inc*METER_PER_INCH;
       //System.out.println(meter);
       double bmi=kg/(meter*meter);
        return bmi;
    }
    public String status(){
        double val=get_BMI();
        if (val < 18.5){
            return "Under weaight";
        }
        else if(val >18.5 && val < 25){
            return "Normanl";
        }
        else if (val >25 && val < 30){
            return "Over Weight";
        }
        else if(val >30 && val< 35){
            return "very Over Weight";
        }
        else if(val >35 && val <100){
            return "you need to a Doctor";
        }
        else
        return " Invailed BMI";
    }
    String get_name(){
        return name;
    }
}
public class _207_BMI_Calculator {
    private static final DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String ar[]){
        BMI Obj=new BMI("Tanvir Rifat",5.8333333333,65.77089365);
    System.out.println(Obj.get_name()+" your BMI is "+df2.format(Obj.get_BMI())+" and "+Obj.status());
    }
}
