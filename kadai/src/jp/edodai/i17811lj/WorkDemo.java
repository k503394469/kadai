package jp.edodai.i17811lj;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class WorkDemo {
    public static void main(String[] args) {
        // defined code
        final String[] scode = {"1", "2", "3", "4", "5", "6", "7", "8", "9","0"};
        final Random rand = new Random();

        final JFrame jf = new JFrame("code");
        final JLabel jl = new JLabel("start");
        final JButton jb = new JButton("start");
        final Timer times = new Timer(200, null);
        Container con = jf.getContentPane();
        con.setLayout(null);
        con.add(jl);
        jl.setFont(new Font("宋体", Font.PLAIN, 30));
        jl.setBounds(70, 30, 126, 36);
        con.add(jb);
        jb.setBounds(90, 90, 90, 30);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!times.isRunning()) {
                    times.start();
                } else {
                    times.stop();
                }
                if ("start".equals(jb.getText())) {
                    jb.setText("stop");
                } else {
                    jb.setText("start");
                }
                times.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String str = "";
                        for (int i = 0; i < 5; i++) {
                            str += scode[rand.nextInt(scode.length)];
                        }
                        jl.setText(str);
                    }
                });
            }
        });
        jf.setSize(260, 200);
        jf.setAlwaysOnTop(true);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}