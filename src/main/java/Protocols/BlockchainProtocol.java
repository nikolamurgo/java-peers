package Protocols;

import com.google.gson.Gson;
import example.Block;
import example.Message;
import example.NetworkManager;

public class BlockchainProtocol implements Protocol{
    NetworkManager networkManager;
    public BlockchainProtocol(NetworkManager networkManager){
        this.networkManager = networkManager;
    }
    @Override
    public void digest(Message message) {
        Block block= new Gson().fromJson(message.body, Block.class);
        System.out.println("new block: "+block.blockHash);
    }

    @Override
    public void respond(Message message) {

    }
}
