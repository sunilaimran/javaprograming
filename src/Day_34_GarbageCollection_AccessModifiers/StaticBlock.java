package Day_34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");

    }
    static {//run first before anything, and only run one time
        System.out.println("static method");

    }




}
