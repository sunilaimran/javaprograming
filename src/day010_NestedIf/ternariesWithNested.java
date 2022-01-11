package day010_NestedIf;

public class ternariesWithNested {
    public static void main(String[] args) {

        int s = 85;
       /* if(s >= 0 && s <= 100) {

            if (s >= 0) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        }else{
            System.out.println("invalid score");
        }*/

        String result = (s >= 0 && s <= 100)? (s >= 60)? "passed" : "failed" :  "invalid score";
        System.out.println(result);













    }
}
