package officeHours_3;

public class sumOfEven_Odd {
    public static void main(String[] args) {

     int sumOfEven= 0;
     int sumOfOdd = 0;
     int i = 5;
     do {
         if (i % 2 == 0) {
             sumOfEven += i;
         } else {
             sumOfOdd += i;
         }
         i++;

     }
    while (i<=10);
        System.out.println("sum of even number are " + sumOfOdd);
        System.out.println("sum Of Odd number are  " + sumOfEven);





       /*
          (SumOfEven_Odd)
        Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
       */
    }
}
