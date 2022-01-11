package day012_Scanner;

import java.util.Scanner;// * wild import:import everythings from package

public class ScannerPractice {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        scan.nextInt();

        int num = scan.nextInt();

        String result = "";
        if (num >= 1 && num <= 7){
            result = (num ==1)?"Monday" :(num == 2)?"tuesday" :(num == 3)?"wednesday" :(num ==4)?"thursday"
                    :(num ==5 )?"friday" :(num ==6)?"saturday" : "sunday";

        }else{
            result = "invalid Number";
        }
        System.out.println(result);

          scan.close();

    }
}
