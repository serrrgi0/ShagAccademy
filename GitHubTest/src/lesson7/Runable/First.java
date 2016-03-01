package lesson7.Runable;

/**
 * Created by Serrrgi0 on 01.03.2016.
 */
public class First {
    public static void main(String[] args) {
        Thread runnable = new Thread(new MyRunnable());
        Thread thread = new MyThead();
        try {
            runnable.start();
            runnable.join();//останавливает поток дожидаясь завершения
            thread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThead extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            try{
                Thread.currentThread().sleep(100);


            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            try{
                Thread.currentThread().sleep(100);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}