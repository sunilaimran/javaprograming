package Day_34_GarbageCollection_AccessModifiers;

public class Constroctor_Vs_StaticBlock {

    static {
        System.out.println("static block");
    }

    public Constroctor_Vs_StaticBlock(){
        System.out.println("Constroctor");
    }


    public static void main(String[] args) {

        new Constroctor_Vs_StaticBlock();
        new Constroctor_Vs_StaticBlock();
        new Constroctor_Vs_StaticBlock();
        new Constroctor_Vs_StaticBlock();
        new Constroctor_Vs_StaticBlock();

    }
}
