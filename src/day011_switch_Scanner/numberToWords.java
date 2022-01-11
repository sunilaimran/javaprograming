package day011_switch_Scanner;

public class numberToWords {
    public static void main(String[] args) {
       int number = 7;

       String result = (number >= 0 && number <= 9)?
                             (number ==0) ?"zero" : (number ==1) ?"one" : (number ==2) ?"Two" : (number ==3) ?"Three"
                                     : (number == 4) ?"Four" : (number ==5) ?"Five" : (number == 6) ?"six" : (number ==7) ?"Seven"
                                : (number ==8) ?"Eight" : "Nine" : "invalid number";


        System.out.println(result);

        System.out.println("-------------------------------");

            int x = 10;
            int y = x++;
        System.out.println(y++ +" "+ x++ +" " +y);





/*
2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 */



    }
}
