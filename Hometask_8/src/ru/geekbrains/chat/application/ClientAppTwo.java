package ru.geekbrains.chat.application;

import ru.geekbrains.chat.client.ClientChatAdapter;

public class ClientAppTwo {
    public static void main(String[] args) {
        new ClientChatAdapter("localhost", 9999);
    }
}
