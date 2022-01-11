package Day25_CostoumMeathod_OverLoading;

import java.util.Arrays;

class AddElementsToArray {

public static void main(String[] args) {

   int[] arr = {1, 2, 3, 4};

   arr = addInteger(arr, 5); //{1,2,3,4,5}

   System.out.println(Arrays.toString(arr));

   System.out.println("------------------------------------");

   double[] arr2 = {1.5, 2.5, 3.5, 4.5};
   arr2 = addDouble(arr2, 5.5); // {1.5, 2.5, 3.5, 4.5, 5.5}

   System.out.println(Arrays.toString(arr2));

   System.out.println("--------------------------------------");

}


public static int[] addInteger(int[] array, int element) {
   int[] result = new int[array.length + 1];

   int i = 0;
   for (int each : array) {
       result[i++] = each;
   }

   result[i] = element;

   return result;
}

//2. create a return method called addDouble that can add a double after the last index of a double array
public static double[] addDouble(double[] array, double element) {
   double[] result = new double[array.length + 1];

   int i = 0;
   for (double each : array) {
       result[i++] = each;
   }

   result[i] = element;

   return result;

}

}