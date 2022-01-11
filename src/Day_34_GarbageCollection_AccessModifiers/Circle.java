package Day_34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radious;
    public static double pi = 3.14;
    public static String name = "Circle";

    public static ArrayList<Integer> numbers = new ArrayList<>();


    // public ststic Sheet sheet;


    public Circle(double radious){
        this.radious = radious;
       // pi = 3.14;
    }

     static {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
     }

}
