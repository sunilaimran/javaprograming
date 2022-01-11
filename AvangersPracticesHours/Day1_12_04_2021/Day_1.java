package Day1_12_04_2021;

import java.util.Locale;

public class Day_1 {
    public static void main(String[] args) {
     //type casting
    // implicit = : done by compiler  :  smaller to bigger data type  :   no lose data
    // explicit =  done by developers  :  bigger to smaller   :   we can lose data

        // byte to short
       byte b = 10;
       short a = b;// implicit

       // double to int

        double d = 5.3;
        int i = (int) d;//explicit

       // long to int

        long l = 999999999l;
        int k =(int)l;
        System.out.println("k = " + k);





        double f = 12.12 ;

        float favr = 12.5f;


        System.out.println("-----------------------------------------------------");

        String str = "Hello";
        str = str.toUpperCase();
         String s = "" + str.charAt(0) + str.charAt(1);

        System.out.println("s = " + s);
        System.out.println("s=" + s.toUpperCase());

        System.out.println("---------------------------------------");


        String str1 = "cydeo";
        str = str1.toUpperCase();
        String last2 = str1.substring(str.length()-2);

        System.out.println(last2.repeat(3));

        String sub = str.substring(3,5);
        System.out.println(sub.repeat(3));



    }
}
