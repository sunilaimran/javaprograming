package day41_Exceptions;


import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_unchecked {
    public static void main(String[] args) {

        //unchecked exception

        int a = 10;
        int b = 0;

       // System.out.println( a/b );

        //System.out.println("wooden spoon");

       char[] characters = { 'A','B','C'};

       // System.out.println(characters[99]);


        Student student = null;

       // System.out.println( student.getName());
        //student.study();

              String str = "wooden spoon";

             // str = null;

       // System.out.println( str.toUpperCase());


        String str2 = ""; //str2 is a empty container right now but null means there is no container nothing occured

        System.out.println( str2.isEmpty());


       // checked Exception

        System.out.println("hello");

      //  Thread.sleep(3000);//sleep checked exception

        System.out.println("cydeo");

      //  FileInputStream file = new FileInputStream("path of the file");


    }
}
