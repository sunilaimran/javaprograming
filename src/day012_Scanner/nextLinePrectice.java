package day012_Scanner;

import java.util.Scanner;

public class nextLinePrectice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the age");
         int age = input.nextInt();

         input.nextLine();
        System.out.println("enter your full name");
        String fullName = input.nextLine();


        System.out.println("enter your GPA");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("enter your school name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);


         input.close();




    }
}
