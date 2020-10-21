import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Data data = new Data();


        System.out.println("Input Number: ");
        data.setNumber(sc.nextInt());

        Thread1 thread1 = new Thread1(data);
        thread1.setName("Thread 1");

        Thread2 thread2 = new Thread2(data);
        thread2.setName("Thread 2");


        thread1.setPriority(6);
        thread2.setPriority(4);

        thread1.start();
        thread2.start();
    }
}
