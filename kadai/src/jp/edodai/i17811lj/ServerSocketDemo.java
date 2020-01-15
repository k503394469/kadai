package jp.edodai.i17811lj;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo{
    public static void main(String[] args) throws Exception {
        InputStream inputStream=null;
        Socket socket=null;
        ServerSocket ss=null;
        while (true) {
            try {
                final int port=2333;
                StringBuffer sb=new StringBuffer();
                ss=new ServerSocket(port);
                System.out.println("Waiting...");
                socket=ss.accept();
                inputStream = socket.getInputStream();
                byte[] b=new byte[4096];
                int len;
                while ((len=inputStream.read(b))!=-1){
                    sb.append(new String(b,0,len));
                }
                System.out.println(sb);
            } catch (IOException e) {
                inputStream.close();
                socket.close();
                ss.close();
            }

        }
    }
}
