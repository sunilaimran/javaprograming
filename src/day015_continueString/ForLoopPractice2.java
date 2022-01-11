package day015_continueString;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

          for(int i = 65; i <= 90; i++){
              System.out.print((char)i+" ");
          }
        System.out.println();

        System.out.println("----------------------------");

              for(char i = 97; i <=122; i++){
                  System.out.print(i+" ");
              }

        System.out.println();

        System.out.println("_____________________________________");

           for(char i = 90; i >= 65; i--){
               System.out.print(i+" ");
           }
        System.out.println();

        System.out.println("____________________________________");
           for(char i = 122; i >=97; i--){
               System.out.print(i+" ");
           }






    }
}
