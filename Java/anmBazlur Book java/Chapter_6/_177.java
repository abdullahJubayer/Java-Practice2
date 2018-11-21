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
class Liquid{
    public void coock(boolean val){
        System.out.println("Liquid");
    }
}
class Cofee extends Liquid{
    @Override
    public void coock(boolean val){
        System.out.println("Cofee");
    }
}
class Milk extends Liquid{
    @Override
    public void coock(boolean val){
        System.out.println("Milk");
    }
}
class Cup{
    private Liquid li;
    void cup(Liquid val){
        this.li=val;
        li.coock(true);
    }
}
public class _177 {
    public static void main(String ar[]){
        Cup Obj=new Cup();
        Cofee Obj1=new Cofee();
        Liquid Obj2=new Liquid();
        Milk Obj3=new Milk();
        Obj.cup(Obj1);
        Obj.cup(Obj2);
        Obj.cup(Obj3);
    }
}
