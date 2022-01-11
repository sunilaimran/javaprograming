package day014_String;

public class stringMeathod3_substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index )

        String word = "cydeo school";
       String brand =  word.substring(0, 4+1);

        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);




        String word2 = "java programming language";
        String s1 = word2.substring(0,   word.indexOf(" "));//"java"
        String s2 = word2.substring( word2.indexOf(" ")+1 ,      word2.lastIndexOf(" "));//programming
        String s3 = word2.substring(word2.lastIndexOf(" ") +1);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);





    }
}
