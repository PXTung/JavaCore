package Part06_PricipleOOP;

public class ClassB extends ClassA{
    private String b;

    public ClassB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void print(String a, String b){
        print();
        super.testOverrideFinal();
    }

    public static void testStatic(){
        testOverrideStatic();

    }



}
