package example;

import java.net.Socket;

public class Peer implements Runnable{
    Socket connection;
    public Peer(Socket connection){
        this.connection = connection;
    }
    @Override
    public void run() {

    }
    public void send(Message message){

    }
}
