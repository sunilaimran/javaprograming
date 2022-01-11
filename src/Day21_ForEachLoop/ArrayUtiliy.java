package Day21_ForEachLoop;


import java.util.Arrays;

public class ArrayUtiliy {
    public static void main(String[] args) {

  /*  int[] num = {1,2,3,4,5};

        System.out.println(num);
        System.out.println(Array.);*/


        System.out.println("-------------------------------------------");


      int[]scores = {50,100,55,65,85,78};

        Arrays.sort(scores);

        System.out.println( Arrays.toString(scores));

        System.out.println("min scores" + scores[0]);
        System.out.println("max score:" + scores[scores.length-1]);


          String[] names = {"sunila" , "imran" , "jannat" , "asad" , "anaya"};

          Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        int[]arr1 = {1,2,3};
        int[]arr2 = {1,2,3};

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);


        System.out.println("--------------------------------------");

          char[] ch1 ={'a','b','c',};
          char[] ch2 ={'b','a','c',};

          Arrays.sort(ch1);
          Arrays.sort(ch2);

          boolean anagram = Arrays.equals(arr1,arr2);







    }
}
