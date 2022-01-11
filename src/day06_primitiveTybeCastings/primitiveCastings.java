package day06_primitiveTybeCastings;

public class primitiveCastings {
    public static void main(String[] args) {
          // smaller primitive can be directil assigned to larger privimtive type
         // larger primitive
        byte a = 100;
        short b = a;
        //short b = (short)a;
       //   (short)a

         int c = b; // implicit casting
         // int c = (int)b

        long d = c;
        //        (long)c



        float e = d;
        double f = e;

        System.out.println("--------------------------");

        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " + y);


        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " +k);

         double l = 2.5;
         float n = (float)l;

        System.out.println(l + " : " + n);

        double m = 10.8;
        int s = (int) m;// 10
        System.out.println(m + " : " +s);

           double d1 = 20.5;
           short  s1 = (short) d1;
        System.out.println(d1 + " : " + s1);

        float f1 = 30.5f;
        long l1 = (long) f1;

        System.out.println(f1+ " : " + l1);




    }








}
