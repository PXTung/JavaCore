import java.util.Random;

public class Thread2 extends Thread {
    private Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        var random = new Random();
        int i = 0;
        while(true){
            synchronized (data){
                data.notifyAll();

                if (!data.isThread1()){
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                i++;

                int value = random.nextInt(100);
                System.out.println(i + ". " + getName() + ": " + value);
                if (value == data.getNumber()){
                    data.setThread2(true);
                    data.notifyAll();
                    break;
                }
            }
        }
    }
}
