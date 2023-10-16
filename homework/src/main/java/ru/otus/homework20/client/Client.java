package ru.otus.homework20.client;

import java.io.*;

public class Client implements AutoCloseable {
    private DataInputStream in;
    private DataOutputStream out;

    public Client(InputStream in, OutputStream out) {
        this.in = new DataInputStream(new BufferedInputStream(in));
        this.out = new DataOutputStream(new BufferedOutputStream(out));
    }

    public void sendMessage(byte[] bytes) throws IOException {
        out.write(bytes);
        out.flush();
    }
    public void receiveMessage() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String str = reader.readLine();
        System.out.println("Request: " + str);
    }
    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }
}
