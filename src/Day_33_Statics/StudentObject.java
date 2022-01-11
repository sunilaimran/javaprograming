package Day_33_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

      Student student1 = new Student("sunila");

      Student student2 = new Student("mariam",'F');

      Student student3 = new Student("nigar",13);

        Student student4 = new Student("ahmed",26,'A');

        Student student5 = new Student("shiam",'F',30);

        Student student6 = new Student("FADY",'M',37,26);

        Student student7 = new Student("Hulya",'F',25,1234,'A');


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        System.out.println(student1 ==  student2);

        Student[] students = {student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));


    }
}
