public class Thread1 extends Thread{
    int data;

    static Thread1 instance = new Thread1();

    public static Thread1 getInstance(){
        return instance;
    }

    Thread2 thread2 = Thread2.getInstance();

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 10; i++){
//                if(i < 10){
//                    try {
//                        this.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
                data = i;
                System.out.println(getName() + ": " + i);

                notifyAll();
            }
        }
    }
}
