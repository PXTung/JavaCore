package Part04_Interface;

public interface IB {
    void printB(String s);
    static void print(String x, String y){
        System.out.println(x + y);
    }
    default void printDefault(String s){

    }
}
