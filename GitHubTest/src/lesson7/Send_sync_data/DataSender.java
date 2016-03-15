package lesson7.Send_sync_data;

/**
 * Created by Serrrgi0 on 01.03.2016.
 */
public class DataSender extends Thread {
    private Data data;

    public DataSender(Data data) {
        super();
        System.out.println("Sender start");
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data) {
            System.out.println("Sender waiting");
            while (!data.isPrepared()) {
                try {
                    data.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Sender send data");
            //System.out.println(data.getList());
        }
    }
}
