package Day_26_CustomMethodPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arr = {1,1,1,11,1,2,2,3,3,3,4,4,1,1,1,1};

        int n = FrequencyOfElement(arr, 1);

        System.out.println(n);
    }

    //[1,1,1,2,3,4,5]
    public static int FrequencyOfElement(int[] array, int element){
        int count = 0;
        for ( int each: array ){
            if (each == element){
                count++;

            }


        }
        return count;
    }

    public static int FrequencyOfElement(double[] array, double element){
        int count = 0;
        for ( double each: array ){
            if (each == element){
                count++;

            }


        }
        return count;
    }

    public static int FrequencyOfElement(char[] array, char element){
        int count = 0;
        for ( char each: array ){
            if (each == element){
                count++;

            }


        }
        return count;
    }

    public static int FrequencyOfElement(String[] array, String element){
        int count = 0;
        for ( String each: array ){
            if (each == element){
                count++;

            }


        }
        return count;
    }



}
