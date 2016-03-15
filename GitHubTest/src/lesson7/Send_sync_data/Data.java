package lesson7.Send_sync_data;

import java.util.ArrayList;

/**
 * Created by Serrrgi0 on 01.03.2016.
 */
public class Data {
    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    private boolean prepared = false;

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    private ArrayList<Integer> list = new ArrayList<Integer>();

    public void addInt(Integer number){
        list.add(number);
    }

}
