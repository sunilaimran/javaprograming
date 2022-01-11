package day011_switch_Scanner;

public class DysInWeek {
    public static void main(String[] args) {

        int number = 9;

        switch(number){//1,2,3,4,5,6,7, == compair
            case 1:
                System.out.println("Monday");
                break;// exit the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;// exit the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                 break;// exit the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;// exit the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break;// exit the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;// exit the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break;

            default:// only get executed if none of the case blocks are matching
                System.out.println("invalid");
                break;//for the last block you dont have t0 give break if up to us because we have to have this  "}"




        }






    }
}
