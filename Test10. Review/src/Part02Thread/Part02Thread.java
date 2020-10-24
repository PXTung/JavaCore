package Part02Thread;

import Part02Thread.Thread.ThreadA;
import Part02Thread.Thread.ThreadB;

public class Part02Thread {
    private static Thread i = Thread.currentThread();

    public static Thread getI() {
        return i;
    }

    public static void main(String[] args) {
//        ThreadA threadA = new ThreadA();
//        Thread threadB = new Thread(new ThreadB());

//        threadA.start();
//        threadB.start();
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread());
        System.out.println(getI());
    }
}