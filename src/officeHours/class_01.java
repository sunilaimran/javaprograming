package officeHours;

public class class_01 {
    public static void main(String[] args) {
    /*
       Create a class named PatientInfo. declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)
     */
       String name = "sunila";
       int age = 38;
       char gender = 'F';
       String dateOfBirth = "12/01/1983";
       boolean isMarried = true;
       String phoneNumber = "(123)456-7890";
       boolean havingInsurance = true;
       String insuranceNumber = "A123456789";
       String employer = "cydeo";
       double copaywithInsurance = 20.00;
       double copayWithoutInsurance = 250.00;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insuranceNumber = " + insuranceNumber);
        System.out.println("employer = " + employer);
        System.out.println("copaywithInsurance = " + copaywithInsurance);
        System.out.println("copaywithInsurance = " + copaywithInsurance);
        System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);


        System.out.println("======Escape sequences==========");
        System.out.println("\tname: "+name+"\n\tage: "+age+ "\n\tgender: "+gender);



          if(havingInsurance){
              System.out.println("copaywithInsurance =" + copaywithInsurance);
          }else {
              System.out.println("copayWithoutInsurance" + copayWithoutInsurance);
          }







    }
}
