package Day33_Statics;

public class EmpolyeeObject {
    public static void main(String[] args) {

        Empolyee empolyee1 = new Empolyee();
        empolyee1.name = "ahmed";
        empolyee1.salary = 110000;

        Empolyee empolyee2 = new Empolyee();
        empolyee2.name = "Aygun";
        empolyee2.salary = 115000;

        Empolyee empolyee3 = new Empolyee();
        empolyee3.name = "fady";
        empolyee3.salary = 120000;

        System.out.println(empolyee1.name+ " : "+empolyee1.salary);
        System.out.println(empolyee2.name+ " : "+empolyee2.salary);
        System.out.println(empolyee3.name+ ": "+empolyee3.salary);



        System.out.println(empolyee1.isHuman);
        System.out.println(empolyee2.isHuman);
        System.out.println(empolyee3.isHuman);


    }
}
