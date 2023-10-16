package ru.otus.homework20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(8088)) {
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                readRequest(socket);
                sendMessage("Введите ваше выражение в формате x + y \nдоступны операции +, -, *, /", socket.getOutputStream());
                readRequest(socket);

            }
        }
    }

    private static String readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = reader.readLine();
        System.out.println("Request: " + str);
        return str;
    }

    private static void calculate(String request) {

    }
    private static void sendMessage (String message, OutputStream out) throws IOException {
        byte [] bytes = message.getBytes();
        out.write(bytes);
        out.flush();
    }
}
