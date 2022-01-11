package day015_continueString;

import java.util.Scanner;

public class MaximunNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            int n = scan.nextInt();

            if (n > max) {
                max = n;
            }


        }
        System.out.println(max);
















    }
}
