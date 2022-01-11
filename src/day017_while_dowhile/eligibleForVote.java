package day017_while_dowhile;

import java.util.Locale;
import java.util.Scanner;

public class eligibleForVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();

        while( !(age >= 1 && age <= 120)){
            System.out.println("invalid entery , please re-enter");
            age = scan.nextInt();
        }

        System.out.println("are you a us citizen? yes/no");
        String answer =scan.next();

        while( (answer.equals("yes") || answer.equals("n0")) ){
            System.err.println("invalid entery, please re-enter");
            System.err.println("are you a us citizen? yes/no");
           answer = scan.next().toLowerCase();
        }
        if(age >= 18 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }










    }
}
