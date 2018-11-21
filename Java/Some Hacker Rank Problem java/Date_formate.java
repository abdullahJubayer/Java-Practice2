/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h_java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author abdullah
 */
public class Date_formate {
        public static String getDay(String day, String month, String year) throws ParseException {
        /*
        * Write your code here.
        */
        String s=((day+"/")+(month+"/")+year);
         DateFormat ob=new SimpleDateFormat("dd/MM/yyy");
            Date ss=ob.parse(s);
         DateFormat ob1=new SimpleDateFormat("EEEE");
            String ss3=ob1.format(ss);
        return ss3;
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
            try {  
                System.out.println(getDay(day, month, year));
            } catch (ParseException ex) {
                
            }
    }
}
