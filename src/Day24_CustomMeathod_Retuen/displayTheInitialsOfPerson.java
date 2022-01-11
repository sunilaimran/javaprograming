package Day24_CustomMeathod_Retuen;

public class displayTheInitialsOfPerson {

    public static void main(String[] args) {

      initials("sunila","imran");

        System.out.println("--------------------------------");

        domain("cyder@gmail.com");

        System.out.println("----------------------------------");
        
        nameOfMonth(7);

        System.out.println("-----------------------------------");

        nameOfDay(5);

    }
      public static void initials(String firstName, String lastName){
          System.out.println(firstName.charAt(0)+ "."+lastName.charAt(0));
      }
      public static void domain(String email){
        String domain = email.substring(email.indexOf('@')+1, email.lastIndexOf(".") );
          System.out.println("domain = " + domain);
      }
      public static void nameOfMonth(int number){
        String name = "";
        if(number>= 1 && number<= 12){
            name = (number ==1)?"jan" :(number ==2)?"feb" :(number ==3)?"mar" :(number ==4)?"apr" :(number ==5)?"may" :(number ==6)?"jun"
                    :(number ==7)?"jul" :(number ==8)?"aug"  :(number ==9)?"sep"  :(number ==10)?"oct" :(number ==11)?"nov" :"dec";
        }else{
            name = "invalid";
        }
          System.out.println("month name = " + name);
      }
      public static void nameOfDay(int number){
        String name = "";
        if(number >=1 && number <= 7){
            if(number == 1){
              name = "monday";
            }else if (number == 2){
                name = "tuesday";
            }else if (number == 3){
                name = "wednesday";
            }else if (number ==4){
                name = "thurdsay";
            }else if (number == 5){
                name = "friday";
            }else if (number == 6){
                name = "saturday";
            }else{
                name = "sunday";
            }
          }
          System.out.println(name);
      }
      public static void daysInMonth(int number, int year){

      }
              

          
      
}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */