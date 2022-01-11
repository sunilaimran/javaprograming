package Day23_CustomMeathod_void;

public class CostomMeathodPractice {
    public static void main(String[] args) {


        helloWorld5Times();

        System.out.println("--------------------------");

        helloCydeo5Times();

        System.out.println("------------------------------");

        evenNumbers();

    }



    // creat a funtcion that can print hello world 5 times ==> helloWorld5Times
               public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("hello world!");
        }
    }

    //create a funtcion that can print hello cydeo 5 times ==> helloCydeo5Times

             public static void helloCydeo5Times(){

                 for (int i = 0; i < 5; i++) {
                     System.out.println("hello cydeo!");
                 }
             }

             // create a function that can print all the even number from 1~10 ==>evenNumbers

              public static void evenNumbers(){

         for (int i = 2; i < 11; i+=2) {
             System.out.println(i);
         }

     }

}
