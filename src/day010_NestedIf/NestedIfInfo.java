package day010_NestedIf;

public class NestedIfInfo {
    public static void main(String[] args) {
     /*
       int score = 400;

       if(score <= 0 && score >= 100);*/

  int age = 25;
  boolean hasId = true;


  if(hasId) {// if the person is 21 years old or older

      if ((age >= 21)) {
          System.out.println("Eligible to buy the alcohol");

      } else {
          System.out.println(" Not Eligible to buy the alcohol");

      }
  }else{// if the person dose not have id
      System.out.println("you must habe an id to buy alcohol");
  }

        System.out.println("---------------------------------------");

    int number = 7;
    if(number >= 1 && number<= 7){

      if(number ==1){
          System.out.println("Monday");
      }else if(number == 2) {
          System.out.println("Tuesday");
      }else  if(number == 3){
          System.out.println("Wednesday");
      }else if(number ==4){
          System.out.println("Thursday");
      }else if (number == 5){
          System.out.println("friday");
      }else if(number == 6){
          System.out.println("Staurday");
      }else  if (number ==7){
          System.out.println("Sunday");


      }else{

      }



    }

      }







}
