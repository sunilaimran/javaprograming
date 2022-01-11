package officeHours;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
  /*
 A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
                            Create a quantity variable
                            Suppose, one unit will cost 100.
                            Judge and print total cost for user.
                            ( Scanner Class can be used )

                            INPUT for quantity :  5
                             EXPECTED : No discount applied

                            INPUT for quantiy  :  15
                             EXPECTED : You get a discount of $discount and
                              your total cost is $totalCost
  */

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your quanitity");
         int quantity = scan.nextInt();


         double unitprice = 100;
         double totalcost = quantity*unitprice;
         double discountrate = 0.1;
         double totaldiscount ;

         if(totalcost>=1000){
             totaldiscount=discountrate*totalcost;
             System.out.println("you will get a discount of" +totaldiscount+"and your total will be" +(totalcost-totaldiscount));
         }else{
             System.out.println("no discount applied");
         }






    }
}
