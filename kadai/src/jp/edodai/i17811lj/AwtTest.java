package jp.edodai.i17811lj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AwtTest extends JFrame implements ActionListener {
    Random r=new Random();
    ImageIcon [] icons={new ImageIcon("/usr/project/kadai/kadai/src/jp/edodai/i17811lj/guu.png"),new ImageIcon("/usr/project/kadai/kadai/src/jp/edodai/i17811lj/choki.png"),new ImageIcon("/usr/project/kadai/kadai/src/jp/edodai/i17811lj/paa.jpg")};
//    ImageIcon [] icons={new ImageIcon(""),new ImageIcon(""),new ImageIcon("")};
    JButton jb1=new JButton(icons[0]);

    JButton jb2=new JButton(icons[1]);
    JButton jb3=new JButton(icons[2]);
    JPanel jbs=new JPanel();
    JLabel info=new JLabel();
    public AwtTest(){
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
    public void handan(int user,int com){
        String com_str=null;
        if (com==0){
            com_str="guu";
        }else if (com==1){
            com_str="cyoki";
        }else if (com==2){
            com_str="paa";
        }
        info.setIcon(icons[com]);
        info.setFont(new Font("MS ゴシック", Font.PLAIN, 30));
        if (user==com){
            info.setText("Draw！Computer is "+com_str);
        }else {
            if (user==0&&com==1){
                info.setText("You Win！Computer is "+com_str);
            }else if (user==0&&com==2){
                info.setText("You Lose！Computer is "+com_str);
            }else if (user==1&&com==2){
                info.setText("You Win！Computer is "+com_str);
            }else if (user==1&&com==0){
                info.setText("You lose！Computer is "+com_str);
            }else if (user==2&&com==0){
                info.setText("You Win！Computer is "+com_str);
            }else if (user==2&&com==1){
                info.setText("You lose！Computer is "+com_str);
            }
        }
    }
    public void show_info(int btn_str){
        int jb = r.nextInt(3);
        System.out.println(jb);
        handan(btn_str,jb);
    }
    /**
     * Listener
     * @param actionEvent
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (jb1.equals(actionEvent.getSource())) {
            show_info(0);
        }else if (jb2.equals(actionEvent.getSource())){
            show_info(1);
        }else if (jb3.equals(actionEvent.getSource())){
            show_info(2);
        }
    }
}
