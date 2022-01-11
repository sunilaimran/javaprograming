package day012_Scanner;

import java.util.Scanner;

public class scannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("enter your full name");
         String fullname = input.nextLine();


        System.out.println("enter your programming language ");
        String programming = input.nextLine();

        System.out.println("enter your age");
        int age = input.nextInt();

        System.out.println("fullname = " + fullname);
        System.out.println("programming = " + programming);



    }
}
