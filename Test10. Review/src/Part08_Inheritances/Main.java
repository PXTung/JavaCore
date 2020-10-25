package Part08_Inheritances;

import Part07_AbstractClass.ClassAbstract;

public class Main extends ClassA{
    static {
        System.out.print("Derived static block\n");
    }

    {
        System.out.print("Derived instance block\n");
    }

    public Main() {
        System.out.print("Derived constructor\n");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        new ClassA();
    }


    @Override
    public void test() {
        super.test();
    }

    void mainTest(){

    }


}
