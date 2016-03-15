package lesson8.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Serrrgi0 on 03.03.2016.
 */
public class Server {
    private static ArrayList<ClientSoketListener> clients = new ArrayList<ClientSoketListener>();

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            while (true) {
                System.out.println("Waiting for clients...");
                Socket clientSoket = ss.accept();
                clients.add(new ClientSoketListener(clientSoket));
                System.out.println("New client connected...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendToAll(String message) {
        for (ClientSoketListener client: clients) {
            client.send(message);
        }

    }
    public static void sendToOther(String message, ClientSoketListener that) {
        for (ClientSoketListener client: clients) {
            if (client!=that)
                client.send("Some clients write"+message);
            else
                client.send("I write "+message);
        }

    }
    public  static  void closeClient(ClientSoketListener client) {
        clients.remove(client);
    }
}
