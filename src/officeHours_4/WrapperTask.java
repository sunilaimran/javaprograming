package officeHours_4;

import org.w3c.dom.ls.LSOutput;

public class WrapperTask {
    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result += " ";
            }

            if (Character.isAlphabetic(str.charAt(i))) {
                result += str.charAt(i);

            }
        }
        System.out.println(result.trim());


    }
}
/*   (WraperTask)

                   Task :

                        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                        Write a method that returns : Welcome To Core Java

                */