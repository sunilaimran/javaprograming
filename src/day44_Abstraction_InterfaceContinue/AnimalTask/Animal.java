package day44_Abstraction_InterfaceContinue.AnimalTask;

public abstract class Animal {


// Consider a real-life example of a man driving a car.
// The man only knows that pressing the accelerators will increase the speed of a car or applying brakes will stop the car,
// but he does not know about how on pressing the accelerator the speed is actually increasing,
// he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc in the car.
// This is what abstraction is.

//instance methods accept instance and static variables but static methods do not accept instance variables, static only
//- ABSTRACT METHOD RULES -
//1. can not be static
//2. can not be final
//3. can not have private access modifier
//4. does not have body
//5. can only be created in abstract class or interface
//6. meant to be overriden
// From Google: "A concrete class is a class that has an implementation for all of its methods. ...
// It can also extend an abstract class or implement an interface as long as it implements all their methods.
// It is a complete class and can be instantiated. In other words, we can say that any class which is not abstract is a concrete class"
//Abstract class is meant to be inherited only, not meant to be instantiated
//Abstract class is not a concrete class and objects has to be concrete
//A sub-class of abstract class is called concrete class, and it can be instantiated
//A concrete class must implement all the inherited abstract methods
//
//Concrete class:
//can have constructors, instances and static
//regular class can be instantiated
//regular class can not have abstract method
//regular class can be declared as final
//
//Abstract class:
//can have constructors, instances and statics
//abstract class can not be instantiated
//abstract class can have abstract method
//abstract class can not be declared as final



    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;
    public final static boolean canBreathe;
    static{
        canBreathe = true;
    }
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if ( !(gender == 'M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public final void drink(){
        System.out.println(name+" is drinking");
    }

    public  abstract void eat();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}