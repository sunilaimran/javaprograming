package Day37_Inheritance.scrumTask;

public class Tester extends Employee{//tester IS employee,  tester IS A person


    public Tester(String name, int age, char gender, String jobTital, int id, double salary, String companyName) {
        super(name, age, gender, jobTital, id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + "is creating ticket");
    }
}
