package Part06_PricipleOOP;

public class ClassA {
    private String a;

    public ClassA() {
    }

    public ClassA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void print(){
        System.out.println(getA());
    }

    public static void testOverrideStatic(){

    }

    public final void testOverrideFinal(){

    }
}
