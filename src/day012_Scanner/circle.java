package day012_Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      /*  System.out.println("enter the radious of the circle");

         double r = input.nextDouble() ;

         double area = r * r * 3.14;
         double premiter = 2 * r * 3.14;

        System.out.println("area = " + area);;
        System.out.println("premiter = " + premiter);

        input.close();

       */

       // System.out.println(_________________________________________);


        ArrayList<Integer> nums = new ArrayList<>();
        int run = input.nextInt();

        while(run > 0){
            run--;
            switch (input.nextInt()){
                case 1:
                    nums.add(1);
                case 5:
                    nums.add(50);
                    break;
                case 8:
                    nums.remove(0);
                    break;
                case 10:
                case -1:
                case -42:
                    nums.add(1,0);
                    break;
                case 55:
                    nums.add(105);
                case 2:
                    nums.add(20_000);
                    break;
                default:nums.add(null);
            }
        }

        System.out.println(nums);




    }
}
/*
Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */