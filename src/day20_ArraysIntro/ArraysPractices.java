package day20_ArraysIntro;

import java.util.Arrays;

public class ArraysPractices {
    public static void main(String[] args) {

      //Store the elements: 10,20,30,40

      int [] number= {10, 20, 50,70};

        System.out.println(Arrays.toString(number));

        System.out.println("-------------------------------------");

         //creat a veriable that can contain 5 scores

        int []score = new int[5];
        score[1]= 85;
        score[score.length-1] = 95;
        score[3] = 75;
        score[0] = 65;
        score[2] = 55;

        System.out.println(Arrays.toString(score));


        System.out.println("-----------------------------------------------------");

        String[]months ={"january", "fabruary", "march", "april", "may", "june", "july", "august", "september",
                           "october", "november", "december" };


      for (int i = 0; i < months.length; i++) {
        System.out.println(months[i]);
      }

      System.out.println("--------------------------------------------");

      for (int i =  months.length-1;i >= 0; i--) {
        System.out.println(months[i]);
      }

    }
}
