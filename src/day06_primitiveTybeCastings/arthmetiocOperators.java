package day06_primitiveTybeCastings;

public class arthmetiocOperators {

    public static void main(String[] args) {

        System.out.println(10 + 20);//30
        System.out.println(100 - 50);//50
        System.out.println(10 * 6);//68

        System.out.println( 100  /  3);//33
        System.out.println(10.0/4);//2.5
        System.out.println(10d / 4);//2.5

        int a = 100;
        double b = a/6 ;//16
        System.out.println(b);


        double c = (double)a/6;   // 16.66666
        System.out.println(c);




        int num1 = 10;  // 10 divide by 3 is equal to 3 with a remainder of 1
        int num2 = 3;

        int division = num1/num2; // divivsion variable contains the result of num1 divided bt num2
        int reminder = num1 % num2;// reminder variable contains the reminder os num1 divided by number

        System.out.println(num1 +" divided by " + num2);
        System.out.println(num1 + " divided by" + num2 + " is equal to " + division);
        System.out.println(num1 + " divided by" + num2 + " is equal to " + division  + "with a reminder of " + reminder);
     /*
     +: addition
     -: subtract
     *: multiplication
     /: division:
           integer / integer ====> integer
           dacimal / integer =====> decimal
           integer / decmial======> dec


            in math :
               10/4 = 2.5
               in java :
                10/4 = 2
                10.0/4 = 2.5
     % remoinder
        letf over
        10/2 = 5 no letf over
        10/3 = 3.3333
        reminder = numertor - denimenator * result
                    10      -  3 * 3      = 1

                    1/3 = 0.3333....

                    10 % 3 ===> 1


                    45 / 8   = 5.625
                     in math

                     45 - (8 * 5) = 5

                     45 % 8 =====> 5 left overs

      */















    }











}
