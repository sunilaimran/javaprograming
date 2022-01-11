package officeHours_3;

import java.util.Scanner;

public class StringTime {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter any word");
        String word = input.nextLine();
        System.out.println("enter any positive number");
        int num = input.nextInt();

       // int count =0;
        String sum = "";

      //  while (count<num){// one way to do it
       //     sum +=word;
        //    count++;
      //  }


        for (int i = 0;i <num; i++){// second way to do it
            sum += word;

        }

        System.out.println(sum);










   /*
           Given a string and a non-negative int n, return a larger string that is n copies of the original string.
             input String : Hi  ,  input int : 2
             output: HiHi
         */




    }
}
