package day010_NestedIf;

public class ternariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if(n%2 ==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        System.out.println("---------------------------------");



         String result1 = (n%2 == 0)?"even" : "odd";

        System.out.println(result1);

        System.out.println("-------------------------------------");

         int age = 23;

        /* if(age >=21){

             System.out.println("eligible"); //string
         }else{
             System.out.println("not ligible");// string

         }*/
        String result2 = (age >= 21) ? "eligible" : "not eligible" ;
        System.out.println(result2);

        System.out.println("-----------------------------------");

         int number = 100;
        /* if(number>0){
             System.out.println("positive");
         }else if (number <0){
             System.out.println("negative");
         }else{
             System.out.println("zero");
         } */

       String result3 = (number>0)? "positive" : (number <0)?  "negative" : "zero";

        System.out.println(result3);



    }



}
