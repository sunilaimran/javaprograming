import day_30_CostomClass.Dog;

public class DogTask {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color  = dogColor;
    }


    public void eat(){
        System.out.println(name+ "is eating");
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';





    }

}

class DogObject{

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