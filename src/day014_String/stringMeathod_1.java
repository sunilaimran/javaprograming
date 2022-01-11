package day014_String;

public class stringMeathod_1 {
    public static void main(String[] args) {
         // trim():
        String str1 = "    batch25     ";
        str1 = str1.trim(); // remove the extra space or unnecessart space

        System.out.println(str1);

        System.out.println("-------------------------------------------");

        //indexof() and lastindexof();
         String str2 = "cydeo school";
         int n1 = str2.indexOf("h");//8

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);//9

        String str3 = "java programming language";

        int n3 = str3.indexOf("a");
        System.out.println("n3 = " + n3);

        System.out.println("-----------------------------------------");

          String s = "java nova cava wawa orange";

          int firstA = s.indexOf("a");
          int lastA = s.lastIndexOf("a");//+1 try or -1
          int secondA = s.indexOf("a ");
          int thiredA = s.indexOf("a c");
          int secondlastA = s.lastIndexOf("a o");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thiredA = " + thiredA);
        System.out.println("secondlastA = " + secondlastA);

        System.out.println("----------------------------------------------------");




    }
}
