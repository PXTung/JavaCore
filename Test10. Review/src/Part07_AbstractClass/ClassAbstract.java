package Part07_AbstractClass;

public abstract class ClassAbstract {
    private String b;

    public ClassAbstract() {

    }

    public ClassAbstract(String b) {
        this.b = b;
    }

    abstract void test();
}
