package example;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1233);
            serverSocket.accept();
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }
}