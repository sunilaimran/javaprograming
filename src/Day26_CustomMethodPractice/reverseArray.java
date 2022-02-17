package Day26_CustomMethodPractice;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));



    }
    //reverse the array, return a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    //reverse the array, return a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    //reverse the array, return a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        char j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }
    //reverse the array, return a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }






}
