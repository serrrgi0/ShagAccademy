package lesson7.syncBlock;

/**
 * Created by Serrrgi0 on 01.03.2016.
 */
public class Sync extends Thread {

    public static void main(String[] args) {
        Count lock = new Count();
        Sync counter1 = new Sync();
        counter1.setName("1");//Установка имени потока
        Sync counter2 = new Sync();
        counter1.start();
        counter2.start();
        try {
            counter1.join();//Ожидание окончания потока
            counter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result:"+lock.count);
    }
    public static class Count {
        public Integer count = 0;//не кешировать значения
    }
    @Override
    public void run() {
        /*for (int i = 0; i <1000000 ; i++) {
                synchronized (lock) {  //синхронизированный блок
                    lock.count++;
                }
        }*/
    }
}
