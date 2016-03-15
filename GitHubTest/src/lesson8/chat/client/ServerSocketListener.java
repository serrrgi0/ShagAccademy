package lesson8.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Serrrgi0 on 03.03.2016.
 */
public class ServerSocketListener extends Thread {
    private Socket serverSocket;

    public ServerSocketListener(Socket serverSocket) {
        this.serverSocket = serverSocket;
        this.start();
    }

    @Override
    public void run() {
        System.out.println("Listening for server messages...");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            //BufferedWriter writer = new BufferedWriter();
            while (serverSocket.isConnected()) {
                String text = reader.readLine();
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
