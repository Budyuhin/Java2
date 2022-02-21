package ru.geekbrains.java2.lesson6_1;

import javax.imageio.IIOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Server {
    private static ServerSocket server;
    private static Socket socket = null;
    private static final int PORT = 8189;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            out.println("Сервер запущен, ожидаем подключения...");
            Scanner sc = new Scanner (in);

            socket = server.accept();
            out.println("Клиент подключился");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream ());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            Thread threadReader = new Thread (() -> {
                try {
                    while (true) {
                        outputStream.writeUTF(sc.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threadReader.setDaemon(true);
            threadReader.start();

            while (true){
                String str = inputStream.readUTF ();
                if (str.equals("/конец")){
                    break;
                }
                out.println("Клиент: " + str);
                out.println("Эхо: " + str);
            }
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
