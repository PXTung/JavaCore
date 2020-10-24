package Part02Thread.Thread;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
                System.out.println("B: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
