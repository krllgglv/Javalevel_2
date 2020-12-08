package ru.geekbrains.chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ServerChat implements Chat {
    private ServerSocket serverSocket;
    private Set<ClientHandler> clients;
    private AuthenticationService authenticationService;
    private Map<String, ClientHandler> clientsWithNicks;

    public ServerChat() {
        start();
    }

    @Override
    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }

    private void start() {
        try {
            serverSocket = new ServerSocket(10000);
            clients = new HashSet<>();
            authenticationService = new AuthenticationService();
            clientsWithNicks = new HashMap<>();

            while (true) {
                System.out.println("Server is waiting for a connection ...");
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket, this);
                System.out.println(String.format("[%s] Client[%s] is successfully logged in", new Date(), clientHandler.getName()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }

    @Override
    public boolean isNicknameOccupied(String nickname) {
        for (ClientHandler client : clients) {
            if (client.getName().equals(nickname)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void sendPrivateMessage(String message, ClientHandler clientHandler) {
        String[] messToArr = message.split("\\s");
        if (clients.contains(clientsWithNicks.get(messToArr[1]))){

            clientsWithNicks.get(messToArr[1]).sendMessage(String.format("[%s private 4u] : %s", clientHandler.getName(), messToArr[2]));
        } else {
            clientHandler.sendMessage(String.format("[%s] is offline. Cannot send message",  messToArr[1]));
        }
    }
  

    @Override
    public void subscribe(ClientHandler client) {

        clients.add(client);
        clientsWithNicks.put(client.getName(), client);
    }

    @Override
    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }
}
