package jp.edodai.i17811lj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketDemo {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        Socket s = null;
        Scanner scanner = null;
        InputStream iStream = null;
        BufferedReader bufferedReader = null;
        while (true) {
            try {
                scanner = new Scanner(System.in);
//                s = new Socket("127.0.0.1", 2333);
                s = new Socket("10.235.142.17", 8888);
                String msg = scanner.nextLine();
                outputStream = s.getOutputStream();
                outputStream.write(msg.getBytes());
                iStream = s.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(iStream));
                String ooo = bufferedReader.readLine();
                System.out.println(ooo);
                outputStream.close();
                s.close();
            } catch (Exception e) {
                try {
                    bufferedReader.close();
                    outputStream.close();
                    s.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
//            e.printStackTrace();
            }
        }
    }
}
