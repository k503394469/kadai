package jp.edodai.i17811lj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class AwtClientSocketTest extends JFrame implements ActionListener {
    //C-S Connection parameters;
    OutputStream outputStream = null;
    Socket s = null;
    InputStream iStream = null;
    BufferedReader bufferedReader = null;
    //Game parameters;
    Random r=new Random();
    ImageIcon [] icons={new ImageIcon("/usr/project/kadai/kadai/src/jp/edodai/i17811lj/guu.png"),new ImageIcon("/usr/project/kadai/kadai/src/jp/edodai/i17811lj/choki.png"),new ImageIcon("/usr/project/kadai/kadai/src/jp/edodai/i17811lj/paa.jpg")};
//    ImageIcon [] icons={new ImageIcon(""),new ImageIcon(""),new ImageIcon("")};
    JButton jb1=new JButton(icons[0]);
    JButton jb2=new JButton(icons[1]);
    JButton jb3=new JButton(icons[2]);
    JPanel jbs=new JPanel();
    JLabel info=new JLabel();
    public AwtClientSocketTest() throws Exception{
        s = new Socket("10.235.142.17", 8888);
        outputStream = s.getOutputStream();
        iStream = s.getInputStream();
        bufferedReader = new BufferedReader(new InputStreamReader(iStream));

        jb1.setText("guu");
        jb2.setText("cyoki");
        jb3.setText("paa");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jbs.setLayout(new GridLayout(1,3));
        jbs.add(jb1);
        jbs.add(jb2);
        jbs.add(jb3);
        this.setLayout(new GridLayout(2,1));
        this.add(info);
        this.add(jbs);
        this.setVisible(true);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception{
        new AwtClientSocketTest();
    }
    public void handan(int client,int server){
        String server_str=null;
        if (server==0){
            server_str="guu";
        }else if (server==1){
            server_str="cyoki";
        }else if (server==2){
            server_str="paa";
        }
        info.setIcon(icons[server]);
        info.setFont(new Font("MS ゴシック", Font.PLAIN, 30));
        if (client==server){
            info.setText("Draw！server is "+server_str);
        }else {
            if (client==0&&server==1){
                info.setText("You Win！server is "+server_str);
            }else if (client==0&&server==2){
                info.setText("You Lose！server is "+server_str);
            }else if (client==1&&server==2){
                info.setText("You Win！server is "+server_str);
            }else if (client==1&&server==0){
                info.setText("You lose！server is "+server_str);
            }else if (client==2&&server==0){
                info.setText("You Win！server is "+server_str);
            }else if (client==2&&server==1){
                info.setText("You lose！server is "+server_str);
            }
        }
    }
    public void show_info(int btn_str) throws Exception{
//        int jb = r.nextInt(3);
        String ooo = bufferedReader.readLine();
        int jb=Integer.parseInt(ooo);
        System.out.println(jb);
        handan(btn_str,jb);
    }
    /**
     * Listener
     * @param actionEvent
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            if (jb1.equals(actionEvent.getSource())) {
                show_info(0);
            }else if (jb2.equals(actionEvent.getSource())){
                show_info(1);
            }else if (jb3.equals(actionEvent.getSource())){
                show_info(2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
