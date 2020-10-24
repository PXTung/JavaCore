package Part07_AbstractClass;

public class Main extends ClassAbstract{
    public static void main(String[] args) {
        ClassA a = new ClassA();

        ClassAbstract c = new ClassA(); // Same Inheritances



    }

    public void FF(){
        new ClassAbstract("ANH") {
            @Override
            void test() {

            }
        };
    }

    @Override
    void test() {

    }
}
