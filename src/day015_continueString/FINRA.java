package day015_continueString;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       for(int i  =1; i <=100; i++ ){

           if(i % 15 == 0){// 15,30,45,60,
               System.out.print("FINRA ");

           }else if (i % 3 == 0){//3,6,9,12....99
               System.out.print("FIN");

           }else if(i % 5 ==0){// 5, 10 ,15, 20.......95,100
               System.out.print("RA");

           }else{//1,2,3,......100
               System.out.print(i+" ");
           }
       }















    }
}
