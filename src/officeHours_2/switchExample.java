package officeHours_2;

public class switchExample {
    public static void main(String[] args) {
/* Create  a program that accepts animal as String

           DOG     - domestic animal
           CAT     - domestic animal
           TIGER     - wild  animal

            For other animal - unknown animal

         INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */


      String animal ="DOG";
      String result = "";

      switch (animal){
          case "DOG":
              result= "domestic animal";
              break;
          case  "CAT":
              result="domestic animal";
              break;
          case  "TIGER":
              result=" wild  animal";
              break;
          default:
              result="unknown animal";
      }

        System.out.println(animal+" is " +result);




    }
}
