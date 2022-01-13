package day38_Inheritance.CarTask;

public class Toyota extends Car {


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }


    public void reliable(){
        System.out.println(brand +" "+model + " is reliable than other cars");
    }


   public void start(){
       System.out.println("Twist the kay to ignition to start" + " " + brand + " " + model);
   }
}
