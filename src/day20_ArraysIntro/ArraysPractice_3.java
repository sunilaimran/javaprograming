package day20_ArraysIntro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many number you need to enter");
        int length = scan.nextInt();

       if (length <=0){
           System.err.println("invalid entry");
           System.exit(0);
       }

        int[]number = new int[length];// {10, 0, 0, 0}

        for (int i = 0; i < length; i++) {// 10, 20, 30
            System.out.println("enter a number");
            number[i] = scan.nextInt();// each input user provided during eash exeecuting of the loop, will be asigne
        }


        System.out.println(Arrays.toString(number));


         scan.close();



    }
}
