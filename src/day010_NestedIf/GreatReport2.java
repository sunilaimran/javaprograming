package day010_NestedIf;

public class GreatReport2 {
    public static void main(String[] args) {
        int score = 95;

        if(score >= 0 && score <= 100) {

            if (score >= 90) {
                System.out.println("Exclant");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        }else{
            System.out.println("invilid score");
        }
        System.out.println("------------------------------------");

        String result2 = (score >= 0 && score <= 100)? (score >= 90)?"excillent" :( score >= 80)?"Great" :(score >= 70)?"Good" :(score >= 60)?"passed"
         : "failed" : "invalid score";

        System.out.println(result2);


        System.out.println("------------------------------------------");









    }
}
