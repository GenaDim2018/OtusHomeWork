package ru.otus.homework18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class FileHomework {
    public static void run() {
        String currentPath = "homework/src/main/java/ru/otus/homework18/";
        String data;
        Scanner sc = new Scanner(System.in);
        File file = new File(currentPath);
        out.println(file.exists());
        out.println("File list: " + Arrays.toString(file.list()));
        out.println("Введите имя редактируемого файла");
        String fileName = sc.nextLine();
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(currentPath + fileName))) {
            int n = in.read();
            while (n != -1) {
                out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println();
        out.println("Введите добавляемую строку, для выхода введите ~");
        while (true) {
            data = sc.nextLine();
            if (data.equals("~")) return;
            data += "\n";
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(currentPath + fileName, true))) {
                byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < buffer.length; i++) {
                    out.write(buffer[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
