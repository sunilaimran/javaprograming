package day09_IfStatments;

public class nameOfDay {
    public static void main(String[] args) {
        int n = 5; // 1 ,7

        if (n == 1) {
            System.out.println("monday");
        } else if (n == 2) {
            System.out.println("tuesday");
        } else if (n == 3) {
            System.out.println("wenesday");
        } else if (n == 4) {
            System.out.println("thursday");
        } else if (n == 5) {
            System.out.println("friday");
        } else if (n == 6) {
            System.out.println("saturday");
        } else if (n == 7) {

        } else {
            System.out.println("Invalid");
        }

        System.out.println("---------------------------------------");


        String day;
        if (n == 1) {
            day = "monday";
            //System.out.println("monday");
        } else if (n == 2) {
            day = "tuesday";
            //System.out.println("tuesday");
        } else if (n == 3) {
            day = "wenesday";
            //System.out.println("wenesday");
        } else if (n == 4) {
            day = "thursday";
            //System.out.println("thursday");
        } else if (n == 5) {
            day = "friday";
            //System.out.println("friday");
        } else if (n == 6) {
            day = "saturday";
            //System.out.println("saturday");
        }else {
            day = "sunday";
        }
        System.out.println("day = " + day);


    }

}









