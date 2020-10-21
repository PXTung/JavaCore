public class Data {
    private int number;
    private boolean thread1 = false;
    private boolean thread2 = false;

    public Data() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isThread1() {
        return thread1;
    }

    public void setThread1(boolean thread1) {
        this.thread1 = thread1;
    }

    public boolean isThread2() {
        return thread2;
    }

    public void setThread2(boolean thread2) {
        this.thread2 = thread2;
    }
}
