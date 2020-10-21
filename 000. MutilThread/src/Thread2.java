import java.util.regex.Matcher;

public class Thread2 extends Thread{
    SharedData sharedData;

    static Thread2 instance = new Thread2();

    public static Thread2 getInstance(){
        return instance;
    }

    Thread1 thread1 = Thread1.getInstance();

    Thread2 thread2 = Thread2.getInstance();

    @Override
    public void run() {
        synchronized (thread1){
            for(int i = 0; i < 10; i++){
//                this.notifyAll();
//
                if(i < 10){
                    try {
                        thread1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int result = (int) Math.pow(thread1.data, 2);

                System.out.println(getName() + ": " + result);
            }
        }
    }
}
