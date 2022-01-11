package day09_IfStatments;

public class medianNumber {
    public static void main(String[] args ){

        int e = 10;
        int f = 15;
        int g = 20;
        int MedianNumber = (e+f+g)/3;
        System.out.println(MedianNumber+ " is the median number");

        System.out.println("-----------------------------------------");


           int a = 10,
               b = 20,
               c = 30;

           boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

           boolean bIsMedian = (b > c && b< c) || (b > a && b < c);

           boolean cIsMedian = !aIsMedian && !bIsMedian;

           if(aIsMedian){
               System.out.println(a + " is median number");
           }
          if(bIsMedian){
              System.out.println(b + " is the median number");
          }
          if(cIsMedian){
              System.out.println(c + " is the mrdian number");
          }
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */













    }










}
