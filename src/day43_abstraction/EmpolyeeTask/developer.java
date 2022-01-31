package day43_abstraction.EmpolyeeTask;

public class developer extends Employee{


    public developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing application ");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleep 6 hours");
    }

    public void unitTest(){
        System.out.println(getName()+"is unit testing");
    }



}
