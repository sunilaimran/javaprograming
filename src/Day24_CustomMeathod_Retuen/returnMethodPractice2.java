package Day24_CustomMeathod_Retuen;

import jdk.swing.interop.SwingInterOpUtils;

public class returnMethodPractice2 {


    public static void main(String[] args) {

     //create a function that can calculate the grade

       String str1 = gread(95);

     /*
     check the gread
     'A' ======> excellent
     'B' ======> great
      */
        if (str1.equals("A")){
            System.out.println("Excellent");
        }else if (str1.equals("B")){
            System.out.println("Great");
        }else if (str1.equals("c")){
            System.out.println("Good");
        }else if (str1.equals("D")){
            System.out.println("Passed");
        }else {
            System.out.println("Try again");
        }


    }

    public static String gread(int score){


        String result = "";

        if (score <0 || score > 100){
            result = "invalid";
        }else{
            result = (score >=90)? "A" :(score >=80)? "B" :(score >= 70)? "C" :(score>= 60)? "D" : "F";
        }


        return result;
    }







}
