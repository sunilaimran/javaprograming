package day015_continueString;

import java.util.Scanner;

public class sunOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

          int sum = 0;
          //1+2+3.......
          for(int i = 1; i <101; i++){//i: 1,2,3,4,5...100

              sum +=i;
          }
        System.out.println(sum);

        System.out.println("-----------------------------------------------");

      int total = 0;

        for (int i = 0; i< 5; i++) {


            System.out.println("Enter the number");
            total += scan.nextInt();

        }

        System.out.println("total = " + total);



         scan.close();

    }
}
