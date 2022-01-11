package day017_while_dowhile;

public class returnTheFrequency {
    public static void main(String[] args) {

        String str = "javajava";

        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) {
           String eachsub =  str.substring(i, i+4);

           if(eachsub.equals("java")){

               frequency++;
           }
        }


        System.out.println(frequency);








    }
}
