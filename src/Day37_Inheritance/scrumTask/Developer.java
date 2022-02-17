package Day37_Inheritance.scrumTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String jobTital, int id, double salary, String companyName) {
        super(name, age, gender, jobTital, id, salary, companyName);
    }

    public void code(){
        System.out.println(jobTitle + " " +name + "is coding");
    }
    public void fixBug(){
        System.out.println(jobTitle + " " +name + "is fixing bugs");
    }



}
