package day011_switch_Scanner;

public class gread2 {
    public static void main(String[] args) {
        char ch = 'A';
        String result = "";
        switch (ch){
            case 'A':
            case 'B':
            case 'C' :
            case 'D':
                result=("passed");
               break;
            default:
                result=("invalid");
        }

        System.out.println(result);











      /*
      if the gread is Aor B or C or D =======>"passed"
      otherwisw =====> "failed"
       */





    }
}
