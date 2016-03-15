package lesson7.Send_sync_data;

/**
 * Created by Serrrgi0 on 01.03.2016.
 */
public class DataPreparator extends Thread{
    Data data;
    public DataPreparator(Data data) {
        super();
        System.out.println("Preparator start");
        this.data = data;
    }
    @Override
    public void run() {
        synchronized (data) {
            for (int i = 0; i < 1000000; i++) {
                data.addInt(i);
            }
            data.setPrepared(true);
            data.notifyAll();
        }
    }
}
