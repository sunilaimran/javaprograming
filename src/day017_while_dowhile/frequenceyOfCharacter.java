package day017_while_dowhile;

public class frequenceyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;//1+1+1

        for (int i = 0; i < str.length(); i++) {// i: indexes of str
            char eachChar = str.charAt(i);// eachchar: each character of str
            if(ch == eachChar){// if givin ch is matching with the eacgchar then ch is appare in the string
               frequency++; // ferquancy += 1; both right
            }
        }

        System.out.println(frequency);

















    }
}
