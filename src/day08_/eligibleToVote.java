package day08_;

public class eligibleToVote {
    public static void main(String[] args) {

        String name = "josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";


        //Eligible
        if(isEligible){
            System.out.println("Eligible");

        // not Eligible
        if(!isEligible) {// !true ==> not true ==<> false
            System.out.println("Not Eligible");

        }




        }












    }











}
