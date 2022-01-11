package day010_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
       int number = 5;
       String result = "";

        if (number == 1) {
            result = "january";
        } else if (number == 2) {
            result = "fabuary";
        } else if (number == 3) {
            result = " march";
        } else if (number == 4) {
            result = " april";
        } else if (number == 5) {
            result = "may";
        } else if (number == 6) {
            result = "june";
        } else if (number == 7) {
            result = "july";
        } else if (number == 8) {
            result = "august";
        } else if (number == 9) {
            result = "september";
        } else if (number == 10) {
            result = "october";
        } else if (number == 11) {
            result = "november";
        } else {
            result = "december";
        }
        System.out.println(result);


        System.out.println("------------------------------------------------------");
        String result2 =(number == 1)? "january" :(number == 2)? "fabuary" :(number == 3)? "march" :(number == 4)? "april" :(number == 5)? "may"
        :(number == 6)? "june" :(number == 7)? "july" :(number == 8)? "august" :(number == 9)? "september" :(number == 10)? "october"
        :(number == 11)? "november" : "december";

        System.out.println(result2);












    }


}
