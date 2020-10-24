package Part04_Interface;

public interface IA {
    public void printA(String s);
    abstract void testAbstract();

    static void print(String x, String y){
        System.out.println(x + y);
    }

    default void printDefault(String s){

    }
}
