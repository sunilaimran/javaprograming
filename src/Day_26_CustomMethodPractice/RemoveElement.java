package Day_26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = RemoveElement(numbers, 1); //{100, 300, 400, 500, 600}

        numbers = RemoveElement(numbers, 1); //[100, 400, 500, 600]

        System.out.println(Arrays.toString(numbers));

    }



    public static int[] RemoveElement(int[] array, int index) {

        if (index <0 || index > array.length -1){
            System.err.println("invalid index: "+index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (i == index){
                continue;


        }
        result[j++] = array[i];
    }
        return result;
    }









}
