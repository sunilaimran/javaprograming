package day09_IfStatments;

public class miniNumbers{

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        if (n1< n2) {
            System.out.println(n1 + " is the minimun number");
        }else{
            System.out.println(n2 + "is the minimun number");
        }

        System.out.println("-------------------------------------------");



        int n3 = 100;
        int n4 = 200;


        if (n3 < n4) {
            System.out.println(n1 + " is the minimum number");
        }
        if (n4 < n3) {
            System.out.println(n2 + " is the minimum number");
        }
        if (n3 == n4) {
            System.out.println("Numbers are Equal");

            System.out.println("------------------------------------");

            int n5 = 100,
                n6 = 200;

            boolean n5IsMin = n5 < n6;
            boolean n6IsMin = n6 < n5;
            boolean equal = n5 == n6;

            if(n5IsMin){
                System.out.println(n5 + " is the minimun number");
            }
            if(n6IsMin){
                System.out.println(n6 + " is the minimun number");
            }
            if(equal) {
                System.out.println("Equal");
            }


        }








    }










}
