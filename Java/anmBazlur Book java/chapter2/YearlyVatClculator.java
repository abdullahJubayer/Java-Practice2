/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author jubayer
 */
import java.util.Scanner;
class IncomeText{
    public double Calculator(double income){
        if(income<250000){
            System.out.println("This Year you have no income Text");
        }
        if(income>=250000){
            income=income-250000;
            if(income>0 && income<400000){
                income=(income*10)/100;
                System.out.println("This year your Income text is:"+income);
            }
            if(income>=400000 && income<500000){
                income=(income*15)/100;
                System.out.println("This year your income Text is:"+income);
            }
            if(income>=500000 && income<600000){
                income=(income*20)/100;
                System.out.println("This year your income Text is:"+income);

            }
            if(income>=600000 && income<3000000){
                income=(income*25)/100;
                System.out.println("This year your income Text is:"+income);
            }
            if(income>3000000 && income<1.7976931348623157E308){
                income=(income*30)/100;
               System.out.println("This year your income Text is:"+income);
            }
            
        }
        return 0.0;
    }
}
public class YearlyVatClculator {
    public static void main(String ar[]){
        double income;
        Scanner in=new Scanner(System.in);
        income=in.nextDouble();
        IncomeText obj=new IncomeText();
         System.out.println("Your income is:"+income);
        double value=obj.Calculator(income);
       // System.out.println(value);
    }
}
