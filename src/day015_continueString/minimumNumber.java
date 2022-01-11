package day015_continueString;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         int min =   2147483647;
         for(int i = 10; i < 15; i++){
             System.out.println("Enter you number");
            int num =  scan.nextInt();

             if(num < min){
                 min = num;
             }

         }

        System.out.println("min = " + min);













    }
}
