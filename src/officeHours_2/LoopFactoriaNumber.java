package officeHours_2;

import java.util.Scanner;

public class LoopFactoriaNumber {
    public static void main(String[] args) {

     /* Write a program that can return the factorial number of any given number

        Ex:
        input: 5
        output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
                          */

        Scanner input= new Scanner(System.in);

        System.out.println("enter your number");
        int number = input.nextInt();

        int result=1;

        if (number>2){
            for (int i=5; i>= 1; i--){
                result *= i;
            }
        }else {
           result= number;
        }
        System.out.println("Factorial of number is:" +result);



        input.close();


    }
}
