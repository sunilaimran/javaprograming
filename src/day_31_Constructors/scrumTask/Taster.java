package day_31_Constructors.scrumTask;

public class Taster {

      public String name;
      public int employeeID;
      public String jobTitle;
      public double salary;

    public Taster(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Taster{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokedTesting(){

        System.out.println(name+" is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }










/*Attributes:
                 name, employeeID, JobTitle, Salary

             Add A constructor that can set all the fileds

             Actions:
                smokeTesting(),  creatingTicket(), dailyStandUp() toString()
*/


}
