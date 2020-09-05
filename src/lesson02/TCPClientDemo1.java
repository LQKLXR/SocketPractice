package lesson02;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientDemo1 {

    public static void main(String[] args) throws Exception {
        // 创建一个 Socket
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
        // 获得一个输出流
        OutputStream outputStream = socket.getOutputStream();
        // 读取文件
        FileInputStream fileInputStream = new FileInputStream(new File("12.jpg"));
        // 写出去
        byte[] bytes = new byte[1024];
        int len;
        while((len = fileInputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        //关闭资源
        fileInputStream.close();
        outputStream.close();
        socket.close();

    }
}
