package day19_LoopPractic;

public class uniqueCharacters {
    public static void main(String[] args) {



      String str = "aabccdeef";
      String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);

            int count = 0;//represent the frequency of the char
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);// each charaters of str
                if (ch == each) {
                    count++;
                }
            }
               if(count == 1){// if the frequency of the charatcer is 1, then the character is unique
                   result +=ch;
               }

        }
        System.out.println(result);


      /*  Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

        Ex:
        str = "aabccdeef";

        output:
        bdf

        Hint: if you find out how to find the frequency of one character, then you can*/





    }
}
