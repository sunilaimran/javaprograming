package Day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String os = "ios";

    public String color;

    public String size;

    public static String madeIn = "china";

    public static  boolean hasBattery = true;

    public static  boolean istouchScreen = true;

    public static  boolean hasFaceTime = true;

    public static void printOperatorSystem(){
        System.out.println(os);
    }

   // public static void printModelAndPrice(){
      //  System.out.println(model+ ":"+price);

   // }
    public void method(){
        System.out.println(model+":"+price);
        System.out.println(os);
    }




}
