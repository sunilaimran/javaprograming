package Day35_Encapsulation.encapsulation;

public class personObject {
    public static void main(String[] args) {

        person p1 = new person();
        // p1.name = "Daniel";
        //  p1.age = 28;

        //   p1.name = "";
        //   p1.age = 2000;

        p1.setName("Daniel");
        p1.setAge(45);

        //    System.out.println(p1.name +" : "+p1.age);

        System.out.println(p1.getName()+" : "+p1.getAge());



    }
}
