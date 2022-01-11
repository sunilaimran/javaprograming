package Day_37_Inheritance.animalTest;

import jdk.swing.interop.SwingInterOpUtils;

public class Dog extends Animal{

    public Dog(String name,String bread,char gender,int age,String size,String color){
        super(name,bread,gender,age,size,color);
    }

    public void bark(){
        System.out.println(name + " is barking");

    }


}

