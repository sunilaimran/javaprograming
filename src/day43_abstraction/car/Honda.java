package day43_abstraction.car;

public class Honda extends Car {

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }
     public void stop(){
         System.out.println("");
     }

    public void start(){
        System.out.println("Twist the kay to ignition");
    }




}