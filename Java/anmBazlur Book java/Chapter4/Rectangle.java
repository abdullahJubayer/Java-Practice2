/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author jubayer
 */
public class Rectangle {
    public static void main(String ar[]){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==0||i==9||j==0||j==9){
                System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
