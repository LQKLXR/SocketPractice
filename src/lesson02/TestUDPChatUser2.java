package lesson02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestUDPChatUser2 {
    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket(8888);

        byte[] bytes = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,InetAddress.getByName("127.0.0.1"),9999);
        datagramSocket.receive(datagramPacket);


        System.out.println("从 " + datagramPacket.getAddress() +" 端口 "+ datagramPacket.getPort() + " 收到了 :");
        System.out.println(new String(datagramPacket.getData()));
    }
}
