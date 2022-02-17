package Day32_Constructors;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car("toyota");

        Car car2 = new Car("honda","accord");

        Car car3 = new Car("lwxus","rx350",2021);

        Car car4 = new Car("shaviy","subarban",2021,850000);

        Car car5 = new Car("BMW","x6",2019,70000,"red");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
