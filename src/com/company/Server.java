package com.company;

import java.net.*;
import java.io.*;


public class Server {
    public static void main(String[] args) throws IOException {
        int count=0;
        ServerSocket serverSocket = new ServerSocket(8000);

        while (true) {
            Socket clientSocket = serverSocket.accept();

            System.out.println("Принимается клиентов"+ (count++));
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            writer.write("Ты клиент №"+ count + "\n");
            writer.flush();
            writer.close();

        }
    }
}