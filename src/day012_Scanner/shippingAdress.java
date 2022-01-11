package day012_Scanner;

import java.util.Scanner;

public class shippingAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name");
        String fullname = scan.nextLine();

        System.out.println("enter your building number");
        String buildindNumber = scan.next();

         scan.nextLine();

        System.out.println("enter your street name");
        String streetName = scan.nextLine();

        System.out.println("enter your city name");
        String cityName =  scan.nextLine();

        System.out.println("enter your state name");
        String stateName = scan.next();

        System.out.println("enter your zip code");
        String zipcode = scan.next();

         scan.nextLine();

        System.out.println("enter your country name ");
        String countryName = scan.nextLine();


        System.out.println(fullname);
        System.out.println( buildindNumber  +  streetName);
        System.out.println( cityName  +  zipcode);
        System.out.println(countryName);

        scan.close();















    }
}
