package Day37_Inheritance.animalTest;

  public class Cat extends Animal{

      // shot cut alt+enter+enter to creat the constractor
      public Cat(String name, String bread, char gender, int age, String size, String color) {
          super(name, bread, gender, age, size, color);
      }
      public void scratch(){
          System.out.println(name + " is scratching");
      }

  }
