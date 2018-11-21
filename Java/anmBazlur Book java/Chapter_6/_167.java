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
class Values{
    private String name;
    private long amount;
     public Values(String name,long amount){
         this.name=name;
         this.amount=amount;
     }
     String get_name(){
         return name;
     }
     void deposit(long amount){
         this.amount+=amount;
     }
     long get_amount(){
         return amount;
     }
}
public class _167 {
    public static void main(String ar[]){
        Values OBj=new Values("abdullah",285238);
        //System.out.println(OBj.deposit(50000));
        System.out.println(OBj.get_name());
        System.out.println(OBj.get_amount());
        //System.out.println(_167());
        
    }
}
