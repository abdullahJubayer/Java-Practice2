/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h_java;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class Find_day {

    public static void main(String[] args) {
        Year obj;
        Scanner in = new Scanner(System.in);
        int day, month, year;
        int L_year = 4;
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        if (day == 0 || (month <= 0 && month > 12) || year < 1990) {
            System.out.println("Some Error");
        } else if (month == 1) {
            month = 1;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            System.out.println(result);
            obj=new Year(result);
        } else if (month == 2) {
            month = 4;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            System.out.println(result);
            obj=new Year(result);
        } else if (month == 3) {
            month = 4;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            //System.out.println(result);
            obj=new Year(result);
        } else if (month == 4) {
            month = 0;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
           // System.out.println(result);
           obj=new Year(result);
        } else if (month == 5) {
            month = 2;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
           // System.out.println(result);
           obj=new Year(result);
        } else if (month == 6) {
            month = 5;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            //System.out.println(result);
            obj=new Year(result);
        } else if (month == 7) {
            month = 0;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
           // System.out.println(result);
           obj=new Year(result);
        } else if (month == 8) {
            month = 3;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
           // System.out.println(result);
            obj=new Year(result);
        } else if (month == 9) {
            month = 6;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            //System.out.println(result);
            obj=new Year(result);
        } else if (month == 10) {
            month = 1;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            //System.out.println(result);
            obj=new Year(result);
        } else if (month == 11) {
            month = 4;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            //System.out.println(result);
            obj=new Year(result);
        } else {
            month = 6;
            year = year - 1900;
            int val = year / L_year;
            int sum = year + val + month;
            int result = sum % 7;
            //System.out.println(result);
            obj=new Year(result);
        }
    }
}
