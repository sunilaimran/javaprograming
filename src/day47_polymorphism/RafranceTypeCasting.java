package day47_polymorphism;

import day44_Abstraction_InterfaceContinue.AnimalTask.Animal;
import day44_Abstraction_InterfaceContinue.AnimalTask.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;
import jdk.swing.interop.SwingInterOpUtils;

public class RafranceTypeCasting {
    public static void main(String[] args) {


       // Shape shape = (shape) new Circle(4);//upcasting

        Shape shape1 = new Circle(5);

      //wabDriver driver = (webDiver) new ChromeDriver();

       // Animal dog2 = new Dog("max","husky",'m',3,"small","white");
        //Dog dog3 = dog2;

        Animal animal = new Dog("max","husky",'M',3,"small","white");

         // Dog dog = (Dog)animal;//DOWN CASTING

        System.out.println(animal.getName());
       // System.out.println(dog.getName());

        //animal.bark;
       // dog.bark();

        ((Dog) animal).bark();


    }
}
