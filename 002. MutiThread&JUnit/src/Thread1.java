import java.util.Random;

public class Thread1 extends Thread {
    private Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        Random random = new Random();
        int i = 0;
        while (true){
            synchronized (data) {
                if(!data.isThread2()){
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                i++;
                int value = random.nextInt(100);
                System.out.println(i + ". " + getName() + ": " + value);

                data.notifyAll();
                if (value == data.getNumber()){
                    data.setThread1(true);
                    data.notifyAll();
                    break;
                }

            }
        }
    }
}
