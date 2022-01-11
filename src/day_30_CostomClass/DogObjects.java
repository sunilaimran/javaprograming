package day_30_CostomClass;

public class DogObjects {


    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "lucy";
        dog1.breed = "husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "small";
        dog1.color = "white";



        Dog dog2 = new Dog();

        dog2.name = "Ace";
        dog2.breed = "husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "white & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("jack","german",2,'M',"large","black");


          dog1.eat();

          dog2.bark();


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);





    }




}
