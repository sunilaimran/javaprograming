package day012_Scanner;

import java.util.Scanner;

public class scannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter true or false");
        boolean result = input.nextBoolean();


        System.out.println("result = " + result);
         input.close();
/*
GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */


    }
}
