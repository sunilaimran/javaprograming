package day20_ArraysIntro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that capable enough to contain 5 names

        String[] myGroup = new String[5];

        myGroup[0]= "imran";
        myGroup[1]= "sunila";
        myGroup[2]= "jannat";
        myGroup[3]= "asad";
        myGroup[4]= "anaya";

        System.out.println(Arrays.toString(myGroup));


        System.out.println("----------------------------------------");

       String []days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        System.out.println(Arrays.toString(days));

       int number = 5;
       if (number <1 || number >7){
           System.err.println("invalid number");
           System.exit(0);
       }

        System.out.println(days[number-1]);

    }
}
