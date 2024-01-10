package example;

import java.io.*;
import java.net.Socket;

public class Peer implements Runnable{
    Socket connection;
    BufferedReader in;
    BufferedWriter out;
    NetworkManager networkManager;
    public Peer(Socket connection, NetworkManager networkManager){
        this.connection = connection;
        this.networkManager = networkManager;
        try {
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
    @Override
    public void run() {
        System.out.println("Connection with peer: "+connection.getInetAddress()+" established!");
        String msg;
        try {
            while((msg = in.readLine()) != null){
                System.out.println("Msg: " + msg);
                networkManager.broadcast(msg);
            }
        }catch (Exception e){
            System.out.println("no candy for me");
        }
    }
    public void send(String message){
        try {
            out.write(message);
            out.newLine();
            out.flush();
        } catch (IOException e) {
            System.out.println("Connection closed by remote host");
        }
    }
}
