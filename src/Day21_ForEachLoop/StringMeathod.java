package Day21_ForEachLoop;
import java.util.Arrays;

public class StringMeathod {
    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for(char each  : chars ){
            System.out.println(each);
        }




















    }
}
