package ru.geekbrains.java2.lesson6_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static Socket socket;
    private static DataInputStream in;
    private static DataOutputStream out;
    private static String SERVER_ADDR = "localhost";
    private static int SERVER_PORT = 8189;


    public static void main(String[] args) {
    try {
        socket = new Socket (SERVER_ADDR, SERVER_PORT);
        Scanner sc = new Scanner(System.in);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        Thread threadReader = new Thread(() -> {
            try {
                while (true) {
                    out.writeUTF(sc.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        threadReader.setDaemon(true);
        threadReader.start();

        while (true) {
            String str = in.readUTF();
            if (str.equals("/конец")) {
                break;
            } else {
                System.out.println("Сервер: " + str);
            }
        }
    } catch( IOException e){
        e.printStackTrace();
    } finally {
        try {
            socket.close();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
}

