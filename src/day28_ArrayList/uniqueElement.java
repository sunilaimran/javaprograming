package day28_ArrayList;

import java.util.ArrayList;

public class uniqueElement {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("c#");
        list.add("ruby");
        list.add("c++");
        list.add("c++");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);









    }
}
