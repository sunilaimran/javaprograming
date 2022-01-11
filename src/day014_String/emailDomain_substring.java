package day014_String;

public class emailDomain_substring {
    public static void main(String[] args) {
        // domin:

    String email = "cydeo.school@gmail.com";

    int beginningIndex = email.indexOf("@") + 1 ;
    int endingIndex = email.lastIndexOf(".");

    String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println("--------------------------------------");

      String str1 = "java is fun, java is cool, I love java";

      String s1  = str1.substring(0, 10+1);//java is fun

        int beg = str1.indexOf(" j") + 1;
        int end = str1.lastIndexOf(",");

      String s2 = str1.substring(beg, end);

      String s3 = str1.substring(   str1.lastIndexOf("I")  );

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);






    }
}
