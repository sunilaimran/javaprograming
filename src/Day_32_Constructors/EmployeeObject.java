package Day_32_Constructors;

import jdk.swing.interop.SwingInterOpUtils;

public class EmployeeObject {
    public static void main(String[] args) {


      Employee employee1 = new Employee("Aaron");

      Employee employee2 = new Employee("sunika",'F');

      Employee employee3 = new Employee("imran",'M',"SDET");



        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);



    }
}
