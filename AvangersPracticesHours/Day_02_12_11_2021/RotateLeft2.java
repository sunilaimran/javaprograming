package Day_02_12_11_2021;

public class RotateLeft2 {
    public static void main(String[] args) {

/**
 * 3.
 * Given a string, if the first or last chars are 'x', print the string without those 'x' chars,
 * and otherwise print the string unchanged.
 * (do with for loop)
 * <p>
 * <p>
 * input :"xHix" → "Hi"
 * input :"xHi" → "Hi"
 * input :"Hxix" → "Hxi"
 */

      String word = "xHix";
      String temp = "";

       if (word.charAt(0)=='x'&&word.charAt(word.length()-1)=='x'){
           for (int i = 1; i < word.length()-1; i++) {
               temp +=word.charAt(i);
           }
       }else if (word.charAt(0)=='x'){
           for (int i = 1; i <word.length() ; i++) {
               temp += word.charAt(i);
           }
       }else if (word.charAt(word.length()-1)=='x'){
           for (int i = 0; i < word.length()-1; i++) {
               temp += word.charAt(i);
           }
       }
        System.out.println("temp = " + temp);







    }
}
