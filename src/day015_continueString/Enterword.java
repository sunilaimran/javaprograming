package day015_continueString;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Enterword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      /*  System.out.println("enter a word");
        String str = scan.next();*/



        String str1 = "xcodeX";

       String result =  str1.replace("x", "a").replace("X", "a");

        System.out.println(result);

        System.out.println("---------------------------------------------");

          //fullname


          String firstName = "cyDEo";
          String lastName = "SCHOOL";


          firstName = firstName.substring(0,  1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName);



         firstName = ( ""+ firstName.charAt(0)) .toUpperCase() + firstName.substring(1).toLowerCase();
             //C                                 +  ydeo      ==> "Cydeo"
        System.out.println(firstName);


        lastName = lastName.substring(0, 1). toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName+" "+lastName;
        System.out.println(fullName);



    }
}
