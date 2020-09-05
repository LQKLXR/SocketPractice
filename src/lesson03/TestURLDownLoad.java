package lesson03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestURLDownLoad {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://dss1.bdstatic.com/kvoZeXSm1A5BphGlnYG/skin_zoom/12.jpg?2");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(new File("12.jpg"));

        byte[] bytes = new byte[1024];
        int len;
        while((len = inputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,len);
        }

        fileOutputStream.close();
        inputStream.close();
        httpURLConnection.disconnect();

    }
}
