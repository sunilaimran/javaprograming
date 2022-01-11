package day05_concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstname = "Sunila";
        String lastname = "Imran";
        int age = 29;
        String jobTittle = "SDET";
        String companyName = "Apple Inc";
        double salary = 10000.58;

        String fullName = firstname + " " + lastname;





        // Full name of the person is ---------
        System.out.println(" Full name of person is " +  fullName);

       //----is ----years old
        System.out.println( fullName + " is " + age + "years old." );

        //fullName is jobTittle, works at CompanyName, and  fullName, salary is salary.

        System.out.println(fullName + " is " + jobTittle + ",work at "+ companyName + ",and " + fullName + "' salary is " + salary + "." );






    }










}
