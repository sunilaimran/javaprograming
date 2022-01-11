package day20_ArraysIntro;

public class MaxNumberOfArray {
    public static void main(String[] args) {

     int [] number = {10, 5, 4, 20, 1, 0};
     int  max = number [0];//10

        for (int i = 0; i < number.length; i++) {

            if(number[i] > max){
                max = number[i];
            }
        }

        System.out.println(max);









    }
}
