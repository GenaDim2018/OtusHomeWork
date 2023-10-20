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
                sendMessage("Введите ваше выражение в формате x + y, доступны операции +, -, *, /", socket.getOutputStream());
                while (true) {
                    sendMessage(calculate(readRequest(socket)), socket.getOutputStream());
                }
            }
        }
    }

    private static String readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = reader.readLine();
        System.out.println("Request: " + str);
        return str;
    }


    private static void sendMessage(String message, OutputStream out) throws IOException {
        message += "\n";
        byte[] bytes = message.getBytes();
        out.write(bytes);
        out.flush();
    }

    private static String calculate(String request) {
        String resultMessage;
        try {
            String[] parser = request.split(" ");
            int firstValue = Integer.parseInt(parser[0].trim());
            int secondValue = Integer.parseInt(parser[2].trim());
            int result;
            String operation = parser[1].trim();

            switch (operation) {
                case "+" -> {
                    result = firstValue + secondValue;
                    resultMessage = request + " = " + result;
                }
                case "-" -> {
                    result = firstValue - secondValue;
                    resultMessage = request + " = " + result;
                }
                case "*" -> {
                    result = firstValue * secondValue;
                    resultMessage = request + " = " + result;
                }
                case "/" -> {
                    result = firstValue / secondValue;
                    resultMessage = request + " = " + result;
                }
                default -> {
                    resultMessage = "Некорректный ввод";
                }

            }
        } catch (Exception e) {
            resultMessage = "Используйте описанный выше формат ввода";

        }
        return resultMessage;
    }

}
