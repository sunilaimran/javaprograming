package day07_Operators;

import java.sql.SQLOutput;

public class shortHandOpraters {
    public static void main(String[] args) {

        //assignment: =
         int number = 100;

        System.out.println("number = + number");//100

         number = 200;

        System.out.println("number = " + number);//200

       String word = "jave prpgramming" ;

        System.out.println("word = " + word);// java programming

         word = "wooden spoon";

        System.out.println(" word = " + word);

         word = "cydeo";

        System.out.println("word =" + word);

        System.out.println("----------------------------");

         //addition assignment;
          int x = 100;
        System.out.println("x = " + x);

        System.out.println(x + 200);//300
          // x = x + 200;
          x = x + 200;
        System.out.println("x = " + x);


         String str = "wooden";
         str += "spoon";

        System.out.println("str = "+ str);

        System.out.println("------------------------------------");

        double num1 = 2.5;

        System.out.println("num1 =" + num1);

            num1 += 5.5;

        System.out.println("num1 =" + num1);//8.0   // depoit 300$
        int availablebalance = 300;// availablebalance = 100.50 + 300
        System.out.println(" availablebalance=" + availablebalance);// 1300.5

          // withdrawing 500$

        availablebalance -=500; // availablebalance = 1300.5 - 500
        System.out.println("availablebalance =" + availablebalance);


        double num2 = 25000.0;

        // num2 = num2 /2;

        System.out.println(" num2 =" + num2);

        System.out.println("-----------------------");

        double num3 = 100;

        //% =

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("-----------------------");;


        int amount = 127 ; // cents

        int quarter = amount / 25;

        int cents = amount % 25;

        System.out.println("quarter = " + quarter);
        System.out.println("cents = " + cents);







    }











}
