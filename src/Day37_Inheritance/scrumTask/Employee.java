package Day37_Inheritance.scrumTask;

public class Employee extends Person{// Empolyee IS A person

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name + "is working");
    }

    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*Employee:
        name, gender, age, jobTitle, id, salary, companyName
        work(), toString()

 */