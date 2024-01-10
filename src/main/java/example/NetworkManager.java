package example;

import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkManager {

    HashMap<String,Peer> peers;
    Queue<Message> incomming;
    Queue<Message> outgoing;

    public NetworkManager(){
        peers = new HashMap<>();
        incomming = new LinkedBlockingQueue<>();
        outgoing = new LinkedBlockingQueue<>();
    }
}
