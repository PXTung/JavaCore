package Part05_Exception;

import java.lang.Void;

public class Main {
    public static void main(String[] args) {
        try {
            divisions(1, 0);
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }

    public static void divisions(int a, int b) throws MyException {
        try {
            int kq = a/b;
            System.out.println(kq);
        }catch (Exception e){
            throw new MyException("Chia cho 0");
        }
    }
}
