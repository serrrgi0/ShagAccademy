package lesson7.Send_sync_data;

import java.util.Date;

/**
 * Created by Serrrgi0 on 01.03.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data();
        DataSender sender = new DataSender(data);

        Date startTime = new Date();
        sender.start();
        DataPreparator preparator = new DataPreparator(data);
        preparator.start();
        sender.join();
        preparator.join();
        Date endTime = new Date();
        //248
        System.out.println(endTime.getTime()-startTime.getTime());
    }
}
