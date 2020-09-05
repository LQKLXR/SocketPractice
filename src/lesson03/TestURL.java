package lesson03;

import java.net.URL;

public class TestURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://dss1.bdstatic.com/kvoZeXSm1A5BphGlnYG/skin_zoom/12.jpg?2");
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getFile());
    }
}
