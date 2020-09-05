package lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP地址测试
 */
public class TestInetAddress {

    public static void main(String[] args) throws UnknownHostException {
        // 获得本机 IP
        InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
        InetAddress inetAddress2 = InetAddress.getByName("localhost");
        InetAddress inetAddress3 = InetAddress.getLocalHost();
        System.out.println(inetAddress1);
        System.out.println(inetAddress2);
        System.out.println(inetAddress3);

        // 获得网络 IP
        InetAddress inetAddress4 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress4);
    }
}
