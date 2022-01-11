package day20_ArraysIntro;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

      // creat a variable that contain

      char [] alphabets = new char[26];

        char ch = 'z';
        for (int i = 0; i < alphabets.length ; i++ , ch --) {// first method
           alphabets[i] = ch;
        }


        System.out.println(Arrays.toString(alphabets) );
       /* System.out.println(alphabets[0]);*/


        for (char i = 0, j = 'z'; i < alphabets.length ; i++, j--) {// second method
            alphabets[i] = j;
        }
        System.out.println(Arrays.toString(alphabets) );



    }
}
