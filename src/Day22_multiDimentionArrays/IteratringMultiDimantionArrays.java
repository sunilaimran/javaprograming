package Day22_multiDimentionArrays;

import java.util.Arrays;

public class IteratringMultiDimantionArrays {
    public static void main(String[] args) {


        // index of the elements:  0 1 2     0 1 2 3    0 1 2 3 4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        // index of arrays:       0         1            2


        for (int i =0; i < arr2D.length ; i++) {
            System.out.println(Arrays.toString(arr2D[i]));//Outer loop i =>  index of array : Inner loop j => index of element


            for (int j = 0; j < arr2D[i].length; j++) {// j: index number of element
                System.out.print( arr2D[i][j] + " ");
            }

        }

        System.out.println();











    }
}
