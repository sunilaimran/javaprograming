package day28_ArrayList;

public class strongPassword {
    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;// has upper case
        boolean r3 = false;// has lower case
        boolean r4 = false;// has special char
        boolean r5 = false;// has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 =true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
               r5 = true; 
            }else {
                r4 = true;
            }
            
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);


        System.out.println("______________________________________________");


        String password1 = "WoodenSpoon123";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password1.length(); i++) {
            char each = password1.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            }else {
                countSpecialChar++;
            }

        }

      /*  System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigits = " + countDigits);*/

       boolean hasUpperCase = countUpperCase>0;
       boolean hasLowerCase = countLowerCase>0;
       boolean hasDigits = countDigits>0;
       boolean hasSpecialChar = countSpecialChar>0;
       
       boolean strongPassword1 = password1.length() >= 8 && !password1.contains(" ") 
               && hasSpecialChar && hasLowerCase && hasUpperCase && hasDigits;

        System.out.println("strongPassword1 = " + strongPassword1);
       
    }

}

/*
     PasswordValidation:
     Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */




