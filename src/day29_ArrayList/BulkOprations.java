package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOprations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> numbners = new ArrayList<>();

        numbners.addAll(Arrays.asList(100, 200, 300, 400, 500,600, 700, 100, 200, 300, 800, 900));

        numbners.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbners);

        System.out.println("-----------------------------");

         ArrayList<String> jobTitles = new ArrayList<>();
         jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA"));
         jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);

        System.out.println("-----------------------------------");

       ArrayList<Integer> nums = new ArrayList<>();

       nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

       boolean r1 = nums.contains(10);

       boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

       boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------");

        String[] names = {"josh","jack","danial","shay","brenna"};// how to convert arrays to arrayslist

       ArrayList<String> namelist = new ArrayList<>(Arrays.asList(names));//1 way



       // namelist.addAll(Arrays.asList(names));//2 way

        System.out.println(namelist);


        System.out.println("---------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("-------------------------------------");



        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);

    }

        public static ArrayList<Integer> convertArrayToArrayList(int[] array){

            ArrayList<Integer> list = new ArrayList<>();

            for (int each : array) {
                list.add(each);
            }
            return list;
        }


    }

