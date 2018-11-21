package Chapter1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jubayer
 */
class Bycle{
    int cadence=0;
    int gair=1;
    int speed=0;
    int b_reak;
    void cadence_fns(int new_cadence){
        cadence=new_cadence;
    }
    void gair_fns(int new_gair){
        gair=new_gair;
    }
    void speed_fns(int new_increment){
        speed=speed+new_increment;
    }
    void break_fns(int new_decrement){
        b_reak=speed-new_decrement;
    }
    void show(){
        System.out.println("cadence:"+cadence+"\ngair:"+gair+"\nspeed:"+speed+
                "\nb_reak:"+b_reak);
    }
}
public class BycleDemo {
    public static void main(String ar[]){
        Bycle obj=new Bycle();
        Bycle obj2=new Bycle();
        obj.cadence_fns(50);
        obj.gair_fns(2);
        obj.speed_fns(10);
        obj.show();
    }
}
