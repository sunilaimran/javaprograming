package day014_String;

public class stringMeathod_2 {
    public static void main(String[] args) {

       //Replace():oldvalue new value

        String str = "java is fun, I love laerning java";
        String str2 = str.replace("java" , "python");// new string =  "python is fun, I love laerning python"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "imransunila@yahoo.com";
       email = email.replace("yahoo" , "gmail");// new string= imransunila@gmail.com

        System.out.println("email = " + email);

        String sentance = "java java python python c# c# c++ c++ python python python";
        String sentance2 = sentance.replace("python" ,"" );// java java c#
                sentance2 = sentance2.replace("   " , " ");
        System.out.println("sentance2 = " + sentance2);











    }
}
