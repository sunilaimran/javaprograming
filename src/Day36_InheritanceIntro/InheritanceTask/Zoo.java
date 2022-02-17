package Day36_InheritanceIntro.InheritanceTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Huskey",'M',4,"small","black");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("tarcin","British",'M',3,"Large","white");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bangal",'M',4,"Large","Brown");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);





    }
}
