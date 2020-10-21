/*
    - Thực hiện nhiều luồng đồng thời
    + Start()
    + Stop()
    + Sleep()
    + Join()
    + synchronized()
    + wait()
    + notifyAll()
*/


public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.setName("T1");
        thread2.setName("T2");

        thread1.start();
        thread2.start();
    }
}
