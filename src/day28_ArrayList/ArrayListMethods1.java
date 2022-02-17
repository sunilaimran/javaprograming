package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer>  numbers = new ArrayList<>();

        //add()
        numbers.add(10);//
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        numbers.add(2,25);//2


        System.out.println(numbers);

        System.out.println(numbers.size() );

        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);
        // get

        Integer num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("----------------------------");
        //set
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(  numbers.get(i));
        }
        System.out.println("--------------------------------");
        //add // replace
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("java");
        list.add("c#");
        list.add("ruby");

        list.set(2, "javascript");
        list.set(3, "c++");

        System.out.println(list);

        System.out.println("------------------------------------");
        //remove
        ArrayList<String> employes = new ArrayList<>();

        employes.add("suat");
        employes.add("aygun");
        employes.add("olga");
        employes.add("neria");
        employes.add("ali");
        employes.add("hulya");
        employes.add("kaloyan");

        System.out.println(employes);

        employes.remove(0);
        System.out.println(employes);

        employes.remove(0);
        System.out.println(employes);



        ArrayList<Integer>list2= new ArrayList<>();


            Integer a = 1;


        System.out.println(list2.remove(a));

    }
}
