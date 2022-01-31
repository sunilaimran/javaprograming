package day43_abstraction.car;

import jdk.swing.interop.SwingInterOpUtils;

public class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }

}
