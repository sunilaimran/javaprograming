package day011_switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "chrome";

        String result = "";// trmprary value
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";

        if (validBrowser) {

        } else if (browserName == "chrome") {
            result = "chrome browsre is selected";
        } else if (browserName == "firefox") {
            result = "firefox browsre is selected";
        } else if (browserName == "opera") {
            result = "opera browsre is selected";
        } else if (browserName == "safari") {
            result = "opera browsre is selected";

        } else {
            result = "edge browsre is selected";
        }


/*
1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */



    }

}
