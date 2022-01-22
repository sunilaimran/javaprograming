package day41_Exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {


        System.out.println("test started");

       try {

           System.out.println(9 / 0);

           System.out.println("try block");

       }catch (ArithmeticException e){

           System.out.println("catch block");

           System.out.println("ArithmeticException  was occurred");
       }

        System.out.println("test completed");

        System.out.println("-------------------------------------------");

        System.out.println("test2 started");

        int[] numbers = {1,2,3,4};

        try {

            System.out.println(numbers[200]);

            System.out.println("try block");

        }catch (RuntimeException e){//parent of all
            System.out.println("catch block");

        }

        System.out.println("test2 completed");

        System.out.println("---------------------------------");

        System.out.println("test3 started");

        try{
            System.out.println("cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("test3 completed");



        System.out.println("Hello");


        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");


        System.out.println("------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }









    }
}
