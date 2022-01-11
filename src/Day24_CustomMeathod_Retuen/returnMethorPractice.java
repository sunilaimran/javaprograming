package Day24_CustomMeathod_Retuen;

public class returnMethorPractice {

    public static void main(String[] args) {

        // find the number between 100 & 200
         int maxNumber = max(100, 200);

        System.out.println(maxNumber);
        // miltiply the max number by 2

       int multipication = maxNumber*2;

        System.out.println("multipication = " + multipication);
    }


    public static int max(int a, int b){

        int result = 0;

        if (a > b){
            result = a;
        }else {
            result = b;
        }

        return result;

    }






}
