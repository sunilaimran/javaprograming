package day07_Operators;

public class UnaryOpraters {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0);// fasle
        System.out.println( num2 > 0);// false


        System.out.println("---------------------------------");

         int a = 5;
         ++a;// per increment ; increace the value by 1 right away

        System.out.println(a);

         --a; //pre decrement ; decrase the value by 1 right away

        System.out.println("------------------------------------");

          int b = 100;

        System.out.println(++b);

        int c = 100;

        System.out.println(c++);    //post increment: first passes the current value, then increases the value by 1
        System.out.println(c);     //101

        System.out.println("----------------------------");

        int x = 200;
        System.out.println( --x);// pre decrement : desreases the value by 1 right away

        int y = 200;
        System.out.println( y-- );// post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y);//199


        System.out.println("-----------------------------");


        int z= 45;
        System.out.println(++z);// 46
        System.out.println(z++);// 46, z = 47
        System.out.println(z);//47

        System.out.println("--------------------------------");
        int q = 30;

        System.out.println(--q);//29, q = 29
        System.out.println(q--);// 20, q = 28
        System.out.println(q);// 28
    }








}
