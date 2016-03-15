package lesson8.chat2.client;

import lesson8.chat.client.ServerSocketListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
            System.out.println("Connection close...");
        }
    }
}
