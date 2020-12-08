package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Server {
    private ServerSocket serverSocket;
    private DataInputStream in;
    private DataOutputStream out;

    public Server() {
        start();
    }

    private void start() {
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("Server is up and run...");
            System.out.println("Server info: " + serverSocket);

            System.out.println("Server is waiting for a connection...");
            Socket client = serverSocket.accept();
            System.out.println("Client accepted: " + client);

            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());

            new Thread(() -> {
                try {
                    while (true) {
                        String message = in.readUTF();
                        if (message.startsWith("-exit")) {
                            out.writeUTF("cmd EXIT: System shutdown");
                            break;
                        }
                        System.out.println(new Date()+" message from client : "+message);
//
                    }
                } catch (IOException  e) {
                    e.printStackTrace();
                } finally {
                    close();
                }
            }).start();

            Scanner sc = new Scanner(System.in);
            while (true) {
                String message = sc.nextLine();
//                if (true) {
//                    System.out.println("Exit! Thanks! Bye!");
//                    System.out.println("=======================");
//                    break;
//                }
                out.writeUTF(message);
            }
        } catch (IOException e) {
            close();
        }
    }

    private void close() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
