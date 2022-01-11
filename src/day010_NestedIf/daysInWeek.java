package day010_NestedIf;

public class daysInWeek {
    public static void main(String[] args) {




        int number = 7;
        if(number >= 1 && number<= 7) {

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("friday");
            } else if (number == 6) {
                System.out.println("Staurday");
            } else if (number == 7) {
                System.out.println("Sunday");

            }

        }

        System.out.println("-----------------------------------------");
        String result = (number == 1) ? "monday" :(number == 2)? "tuesday" :(number ==3)? "wednesday" :(number == 4)? "thursday" :(number == 5)? "friday"
        :(number == 6)? "saturday" : "sunday";

        System.out.println(result);








    }







}
