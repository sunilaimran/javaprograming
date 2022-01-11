package day015_continueString;

import java.util.Scanner;

public class lunchTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     /*
     1. write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com

    2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
      */
       //1
        System.out.println("Enter email");
        String email = scan.nextLine();

        boolean email1 = email.endsWith("@gmail.com");

        if(email1){
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
        }

        System.out.println("------------------------");

        System.out.println("Enter yopr webside");
        String webside = scan.nextLine();

        boolean webside1 = webside.startsWith("www") && webside.endsWith(".com") || webside.endsWith(".edu") || webside.endsWith(".gov");

        if (webside1) {
            System.out.println("valid webside");
        }else{
            System.out.println("not a valid webside");
        }


    }
}
