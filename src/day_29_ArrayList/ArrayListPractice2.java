package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("ali","david","ahemd","jimmy","danial","ahmed","david","shay"));

        employees.retainAll(Arrays.asList("ahmed","david"));

        System.out.println(employees);


        System.out.println("--------------------------------------------------");


        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );

        list.removeIf( p -> p.charAt(0) == 'M' );

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));








    }
}
