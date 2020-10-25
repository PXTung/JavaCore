package Part08_Inheritances;

public class ClassA {
    static {
        System.out.print("Base static block\n");
    }

    {
        System.out.print("Base instance block\n");
    }

    public ClassA() {
        System.out.print("Base constructor\n");
    }

    private String name;

    public ClassA(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println();
    }

    static void testStatic(){}

    final void testFinal(){}
}
