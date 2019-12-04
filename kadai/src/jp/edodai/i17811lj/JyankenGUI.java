package jp.edodai.i17811lj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JyankenGUI extends JFrame implements ActionListener, ItemListener {
    int m = 1;
    int n = 2;
    int peace = 0;
    int win = 0;
    int lose = 0;
    int all = 0;
    JButton jb1,jb2;
    JLabel jl1,jl2,jl2i,jl3,jl3i,jl4,jl5;
    ImageIcon img1,img2;
    Choice ch;
    JPanel jp1,jp2,jp3,jp4,jp5,jp6;

    public JyankenGUI(){
        jb1 = new JButton("确定出拳");
        jb2 = new JButton("退出");

        //设置监听
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jl1 = new JLabel("猜拳小游戏");
        jl2 = new JLabel("我方出拳");
        jl3 = new JLabel("敌方出拳");
        jl4 = new JLabel("请出拳...");
        jl5 = new JLabel("您玩了"+all+"局，平了"+peace+"局，赢了"+win+"局，输了"+lose+"局");

        System.out.println(m);
        img1 = new ImageIcon("D:/mkn/test/img/"+m+".png");
        img2 = new ImageIcon("D:/mkn/test/img/"+n+".png");

        jl2i = new JLabel(img1);
        jl3i = new JLabel(img2);

        ch = new Choice();
        ch.add("石头");
        ch.add("剪刀");
        ch.add("布");
        ch.addItemListener(this);

        jp1 = new JPanel(new BorderLayout());
        jp2 = new JPanel();
        jp3 = new JPanel(new BorderLayout());
        jp4 = new JPanel(new BorderLayout());
        jp5 = new JPanel(new GridLayout(5,1));
        jp6 = new JPanel(new BorderLayout());

        jp2.setSize(600, 25);
        jp2.setBackground(Color.red);
        jp3.setSize(280, 300);
        jp4.setSize(280, 300);
        jp5.setSize(40, 300);
        jp6.setSize(600, 25);
//        jp6.setBackground(Color.GRAY);
        jp2.add(jl1); //标题
        jp3.add(jl2,BorderLayout.NORTH); //
        jp3.add(jl2i,BorderLayout.CENTER);
        jp4.add(jl3,BorderLayout.NORTH);
        jp4.add(jl3i, BorderLayout.CENTER);//敌方出拳
        jp5.add(ch);
        jp5.add(jb1);
        jp5.add(jb2);
        jp6.add(jl4,BorderLayout.WEST);
        jp6.add(jl5,BorderLayout.EAST);//结果

        jp1.add(jp2,BorderLayout.NORTH);
        jp1.add(jp3,BorderLayout.WEST);
        jp1.add(jp4,BorderLayout.CENTER);
        jp1.add(jp5,BorderLayout.EAST);
        jp1.add(jp6,BorderLayout.SOUTH);

        this.add(jp1);

        this.setTitle("猜拳小游戏");
        this.setSize(540,300);
//      this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);   //居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);  //窗口大小可变

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand()=="确定出拳"){
            n = (int)(1+Math.random()*(3));
            jl3i.setIcon(new ImageIcon("D:/mkn/test/img/"+n+".png"));
            if (m - n == 0) {
                jl4.setText("您和计算机平局");
                peace++;
            }
            if (m - n == -1||m - n == 2) {
                jl4.setText("您赢了！！！");
                win++;
            }
            if (m - n == -2||m - n == 1) {
                jl4.setText("您输了！！！");
                lose++;
            }
            all++;
            jl5.setText("您玩了"+all+"局，平了"+peace+"局，赢了"+win+"局，输了"+lose+"局");
//            System.out.println(n);
        }else{
            this.dispose();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==ch){
            Choice temp=(Choice)e.getSource();
            if (temp.getSelectedItem() == "石头") {
                m = 1;
            }
            if (temp.getSelectedItem() == "剪刀") {
                m = 2;
            }
            if (temp.getSelectedItem() == "布") {
                m = 3;
            }
            jl2i.setIcon(new ImageIcon("D:/mkn/test/img/"+m+".png"));
//            System.out.println(m);
        }
    }
}

