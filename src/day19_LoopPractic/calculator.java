package day19_LoopPractic;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");
        int num1 = scan.nextInt();

        System.out.println("enter a math operator");
        char operator = scan.next().charAt(0);

        if (! (operator == '+' || operator == '_')) {
            System.out.println("invalid math operator:" +operator);
            System.exit(0);
        }


        System.out.println("enter a number");
        int num2 = scan.nextInt();



         scan.close();







    }
}
