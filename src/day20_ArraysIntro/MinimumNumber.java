package day20_ArraysIntro;

public class MinimumNumber {
    public static void main(String[] args) {

       int []number = {100,500,30,40,600,80,-90};

       int min = number[0];

        for (int i = 0; i < number.length; i++) {
           if(number[i] < min){
               min = number[i];
           }
        }


        System.out.println(min);













    }
}
