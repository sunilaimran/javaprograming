package day_30_CostomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

     Student student1 = new Student();
     student1.setInfo("sunila",'F',36,2210,'A');


        Student student2 = new Student();
        student2.setInfo("mariam",'F',29,1010,'B');


        Student student3 = new Student();
        student3.setInfo("huliya",'F',26,5678,'A');

        Student student4 = new Student();
        student4.setInfo("fady",'M',40,1235,'C');



        Student student5 = new Student();
        student5.setInfo("Rose",'F',19,9876,'A');



        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students){
            System.out.println(student);
        }

        System.out.println("---------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);

        System.out.println(angryBirds);





















    }

}
