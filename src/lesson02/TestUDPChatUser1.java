package lesson02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestUDPChatUser1 {
    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket(9999);

        String message = "Hello World!";

        DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(),0,message.getBytes().length,InetAddress.getByName("127.0.0.1"),8888);
        datagramSocket.send(datagramPacket);
    }
}
