package officeHours_4;

import java.util.Arrays;

public class RemoveSpace {

    public static void main(String[] args) {

        String input = "  Hello  world      I    love     java";
        removeSpace(input);

    }

    public static void removeSpace(String str){
        String result = "";
        String[] strArr = str.trim().split(" ");
       // System.out.println(Arrays.toString(strArr));


        for (String each : strArr){
            if (!each.isEmpty()){
                result += each+ " ";
            }
        }

        System.out.println(result);
    }
}
/*  (RemoveSpaces)

                      Task 3 :   Write a method that can remove  all extra space from String


                            Input: "  Hello world      I      love      Java    "
                           Output: Hello world I love Java

                     */