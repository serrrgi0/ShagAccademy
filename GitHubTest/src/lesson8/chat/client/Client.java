package lesson8.chat.client;

import java.io.*;
import java.net.Socket;

/**
 * Created by Serrrgi0 on 03.03.2016.
 */
public class Client {
    public static void main(String[] args) {
        String text;
        try {
            Socket serverSocket = new Socket("localhost",5555);
            ServerSocketListener listener = new ServerSocketListener(serverSocket);
            PrintWriter writer = new PrintWriter(serverSocket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            while(!(text = console.readLine()).equals("-close")) {
                writer.println(text);
            }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
