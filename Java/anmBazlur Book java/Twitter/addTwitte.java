/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class addTwitte implements twitterInterface{
    
    List<Twitter> li=new ArrayList<>();

    @Override
    public void addtwit(Twitter twit) {
        li.add(twit);
    }

    @Override
    public void printteit() {
        for(Twitter ti:li){
            System.out.println(ti);
        }
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String writeTweet=in.nextLine();
        String name=in.nextLine();
        
        Twitter t1=new Twitter(writeTweet,name);
        addTwitte ttt=new addTwitte();
        ttt.addtwit(t1);
        ttt.printteit();
        
      
    }
}
