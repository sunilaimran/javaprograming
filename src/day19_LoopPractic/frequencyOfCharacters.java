package day19_LoopPractic;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);// each character of str
                if (ch == each) {
                    count++;
                }
            }
                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch;
            result += count;
        }
       /* char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);// each character of str
            if(ch == each){
                count++;
            }
        }*/

        System.out.println(result);













    }
}
