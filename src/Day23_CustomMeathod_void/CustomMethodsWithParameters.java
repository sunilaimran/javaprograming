package Day23_CustomMeathod_void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(10);// the method demonds additional info to complete its task


        System.out.println("----------------------------------------");


        ageOfPerson(1995);

        System.out.println("--------------------------------");


        printNumbers(12, 24);
    }

    //create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){//10

        if(number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }


     // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("your age is: " +age);
    }


    //create  function that can print all the number between X and Y

    public static void printNumbers(int x, int y){
        for (int i = x; i < y; i++) {
            System.out.print(i +" ");
        }
    }

}
