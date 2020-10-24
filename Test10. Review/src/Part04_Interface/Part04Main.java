package Part04_Interface;

public class Part04Main implements IA, IB{
    @Override
    public void printA(String s) {

    }

    @Override
    public void testAbstract() {

    }

    @Override
    public void printDefault(String s) {

    }

    @Override
    public void printB(String s) {

    }

    public static void main(String[] args) {
        System.out.println("A");
        IA.print("A", "B");
        IB.print("C", "D");
    }
}
