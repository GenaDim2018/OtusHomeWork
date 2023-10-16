package ru.otus.homework20.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "connection try";
        byte[] bytes;

        try (Socket socket = new Socket("localhost", 8088)) {
            Client client = new Client(socket.getInputStream(), socket.getOutputStream());
            bytes = userInput.getBytes();
            while (true) {
                userInput = scanner.nextLine();
                bytes = userInput.getBytes();
                client.sendMessage(bytes);
                client.receiveMessage();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}