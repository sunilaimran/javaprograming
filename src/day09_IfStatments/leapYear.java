package day09_IfStatments;

import java.sql.SQLOutput;

public class leapYear {
    public static void main(String[] args) {

     int year = 2000;

     boolean leapYear = year%4 == 0;

     if (leapYear){
         System.out.println("year " + year+ " is leap year");
     }
       if (leapYear){
           System.out.println("year " + year+ " is NOT leap year");
       }

        System.out.println("--------------------------------");
        // DIFFERENCE BETWEEN ELSE OR WITHOUT ELSE

        if (leapYear){
            System.out.println("year " + year+ " is leap year");
        }else{
            System.out.println("year " + year+ " is NOT leap year");
        }


    }









}
