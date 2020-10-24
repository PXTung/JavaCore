package Part02Thread.Thread;

public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                this.sleep(200);
                System.out.println("A: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
