package Day35_Encapsulation.encapsulation;

public class EmpolyeeObject {

    public static void main(String[] args) {

     Employee employee1 = new Employee("tania",'F',34,120000);

     employee1.setAge(32);

     Employee employee2 = new Employee("aygun",'F',31,115000);
     employee2.setName("Elvira");

     employee2.setSalary(employee2.getSalary()+ 15000);







        System.out.println(employee1);
        System.out.println(employee2);
    }

}
