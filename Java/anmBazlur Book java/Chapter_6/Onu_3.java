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
class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    String get_name(){
        return name;
    }
    String get_email(){
        return email;
    }
    char get_gender(){
        return gender;
    }
}
class Books{
    private String name;
    private String author;
    private  int price;
    private final int amount;
    Books(String name,String author,int price,int amount){
    this.name=name;
    this.author=author;
    this.price=price;
    this.amount=amount;
    }
    String get_name(){
        return name;
    }
    String get_author(){
        return author;
    }
    int get_price(){
        return price;
    }
    int get_amount(){
        return amount;
    }
}
public class Onu_3 {
    public static void main(String ar[]){
        Author Obj=new Author("Tamim Shahriar Subeen","book@subeen.com",'M');
        Books Obj1=new Books("Computer Programing",Obj.get_name(),450,1000);
        System.out.println("Name of the Book: "+Obj1.get_name());
        System.out.println("Namme of the Author: "+Obj.get_name());
        System.out.println("Price of The Book:"+Obj1.get_price());
        System.out.println("Available in The Store:"+Obj1.get_amount());
    }
}
