package day43_abstraction.EmpolyeeTask;

public final class Driver extends Employee{


    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving ");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is 10 sleeping");
    }


}
