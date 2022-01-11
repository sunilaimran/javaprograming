package day08_;

public class sawpTwoVariable_WithTemporaryVariable {
    public static void main(String[] args) {
      int a = 10;
      int b = 15;
     //--------------------------------
        // after this step b value is gone
       /* int c = b;
        b= c;
        c = b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("------------------------------");*/

        long d = 3_000l;
        double e = (float)d;
        int f = (short)e;

        System.out.println(f % 1000);


/*
1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */














    }











}
