package day018_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoop2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.out.println("invalid entery, please re-enter your age");
                age = scan.nextInt();
            }

            System.out.println("would you like to continue");
            String a = scan.next().toLowerCase();


           while( !(a.equals("yes") || a.equals("no"))){
               System.out.println("invalid entery, please re-enter your age");
               a = scan.next();
           }
           if(a.equals("no")){
               break;
           }


        }





    }
}
