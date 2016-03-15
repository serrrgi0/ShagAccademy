package lesson8.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Serrrgi0 on 03.03.2016.
 */
public class ClientSoketListener extends Thread{
    private Socket clientSoket;
    public ClientSoketListener(Socket clientSoket) {
        this.clientSoket = clientSoket;
        this.start();
    }
    public void send(String message) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(clientSoket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println(message);
    }
    @Override
    public void run() {
        System.out.println("Listening for client messages...");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSoket.getInputStream()));
            //BufferedWriter writer = new BufferedWriter();
            while (clientSoket.isConnected()) {
                String text = reader.readLine();
                System.out.println("Message: "+text);
                Server.sendToOther(text, this);
                //Server.sendToAll(text);
            }
            Server.closeClient(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
