package ru.otus.homework27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class MainApp {
    public static void main(String[] args) {
        String currentPath = "C:/Users/genad/IdeaProjects/OtusHomeWork/homework/src/main/java/ru/otus/homework27/";
        String data;
        int count = 0;
        StringBuilder buffer = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        File file = new File(currentPath);
        out.println("Проверка директории: "+file.exists());
        out.println("Список файлов: " + Arrays.toString(file.list()));
        out.println("Введите имя файла");
        String fileName = sc.nextLine();
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(currentPath + fileName))) {
            int n = in.read();
            while (n != -1) {
                out.print((char) n);
                buffer.append((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = buffer.toString();
        out.println();
        out.println("Введите искомую строку");
        data = sc.nextLine();
        while (text.contains(data)){
            text = text.replaceFirst(data, "");
            count+=1;
        }
        out.println("Текст файла содержит искомую подстроку: "+ count+" раз.");
    }
}
