package Day_37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {


      Iphone iphone = new Iphone("Iphone","6.7",1000,"Black");

      Samsung samsung = new Samsung("galaxy s19","6 inch",900,"white");

      Nokia nokia = new Nokia("Brick","4 inch",50,"gray");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(567890);
        iphone.faceTime("yahoo@gmail.com");


        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        nokia.call(234567890);
        nokia.text(564789546);
        nokia.selfDefense();




    }
}
