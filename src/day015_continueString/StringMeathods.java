package day015_continueString;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class StringMeathods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = " ";
         boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

       String str2 = "cydeo      ";
        System.out.println(str2.isBlank());

        System.out.println("-----------------------------------");

        String s1 = "cydeo";
        String s2 = "CYDEO";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        System.out.println("---------------------------------");

        String sentance = "My favorite programming is java";

        boolean hasJava = sentance.contains("java");
       boolean hasCshape = sentance.contains("C#");

        System.out.println(hasJava);
        System.out.println(hasCshape);

        System.out.println("-----------------------------------");
          // equal and equalignorcase
        String input1 = "I love jAvA";
        String input2 = "java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("java"));//true

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("-----------------------------------");

        String a = "Wooden Spoon";
         boolean x = a.startsWith("Woo");
         boolean y = a.endsWith("Spoon");
         boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);




    }
}
