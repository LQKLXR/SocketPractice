package lesson02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo01 {

    public static void main(String[] args) throws IOException {
        // 创建一个 ServerSocket，Socket服务器
        ServerSocket serverSocket = new ServerSocket(8888);
        // 接收到服务器传来的Socket
        Socket socket = serverSocket.accept();
        // 获得输入流
        InputStream inputStream = socket.getInputStream();
        // 写到本地
        byte[] bytes = new byte[1024];
        int len;
        FileOutputStream fileOutputStream = new FileOutputStream(new File("45.jpg"));
        while ((len = inputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        inputStream.close();
        socket.close();
    }

}
