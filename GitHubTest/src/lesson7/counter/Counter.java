package lesson7.counter;

/**
 * Created by Serrrgi0 on 01.03.2016.
 */
public class Counter extends Thread {
    public static volatile Integer count = 0;//не кешировать значения
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        counter1.start();
        counter2.start();
        try {
            counter1.join();
            counter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Counter.count);
    }

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            count++;
            System.out.println(count);
        }
    }
}
