package example;


public class Main {
    public static void main(String[] args) {
        NetworkManager networkManager = new NetworkManager();
//        networkManager.connect("192.168.31.157",4567);
        System.out.println(new Message("block","hello").serialize());
    }
}