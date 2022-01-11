package day08_;

import jdk.swing.interop.SwingInterOpUtils;

public class logicalOperators {
    public static void main(String[] args) {
       String name = "Steven";
       int age = 34;
       String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
            //                 14 >= && "USA" == "USA"
            //                 false  && true ==> false

        System.out.println(name + " is eligible to vote:" + isEligible);

        System.out.println("-------------------------------------");


        String name2 = "josh";
        int creditScore = 720;
        int age2 = 23;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21;

        System.out.println(name2 + " is elegiable for loan: " + isEligible2);


        System.out.println("---------------------");
        String name3 = "shay";
        int age3 = 21;
        char gender =  'F';

        boolean isEligible3 = age3 >= 18 &&  (gender == 'M' || gender == 'F');
           //                   21 >= 18 && ( 'F' == 'M'     || 'F'  ==  'F' )


        System.out.println(name3 + "is elegiable for register: " + isEligible3);

        System.out.println("----------------------------");



        String name4 = "james";
        String countryOfBirth = "UK";
        boolean marridToUSCitizen = false ;
        boolean isEligible4 = countryOfBirth == "USA"  || marridToUSCitizen == true;
        //                        true                 ||       false


        System.out.println(name4 +" is elegible for apply to US citizenShip " + isEligible4);













    }














}
