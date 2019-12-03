package jp.edodai.i17811lj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JyankenGUI extends JFrame implements ActionListener {
    JLabel message;                // 表示メッセージ
    JLabel sp1, comp, sp2;        // コンピュータの手と空欄2個
    JButton[] b = new JButton[3];        // 人間の手のボタン
    ImageIcon[] hand = {
            new ImageIcon("guu.png"),    // グーのアイコン
            new ImageIcon("choki.png"),    // チョキのアイコン
            new ImageIcon("paa.jpg")    // パーのアイコン
    };
    String[] te = {"グー", "チョキ", "パー"};

    public JyankenGUI(String title, int width, int height) {
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        message = new JLabel();        // 勝ち負け表示のメッセージ
        message.setFont(new Font("MS ゴシック", Font.PLAIN, 30));
        sp1 = new JLabel();            // 常に空欄
        comp = new JLabel();        // コンピュータの手
        sp2 = new JLabel();            // 常に空欄
        comp.setFont(new Font("MS ゴシック", Font.PLAIN, 30));
        for (int i = 0; i < 3; i++) {
            b[i] = new JButton(te[i], hand[i]);        // 人間の手のボタン
            b[i].addActionListener(this);        // ボタンをクリック可能にする
            b[i].setFont(new Font("MS ゴシック", Font.PLAIN, 30));
        }

        Container c = getContentPane();        // 内容を表示する全領域
        c.setLayout(new BorderLayout());    // 内容を東西南北に配置する方式
        JPanel p1 = new JPanel();            // グリッドパネル
        p1.setLayout(new GridLayout(2, 3));    // 内容を2行×3列に配置する方式
        c.add(message, BorderLayout.NORTH);    // 全領域の“北”にメッセージ
        c.add(p1);            // 全領域の“次の位置”にパネルを置き，その中で：
        p1.add(sp1);        // 0行0列 に空欄
        p1.add(comp);        // 0行1列 にコンピュータの手
        p1.add(sp2);        // 0行2列 に空欄
        p1.add(b[0]);        // 1行0列 にグーボタン
        p1.add(b[1]);        // 1行1列 にチョキボタン
        p1.add(b[2]);        // 1行2列 にパーボタン
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int you, com;            // メソッド内だけで使う局所変数を宣言
        int win = 0, lose = 0, draw = 0;
        JButton button = (JButton) e.getSource();    // クリックされたボタン
        for (you = 0; button != b[you]; you++) {
        }
        com = (int) (Math.random() * 3);
        comp.setText(te[com]);
        comp.setIcon(hand[com]);
        if (you == com) {
            draw++;
            message.setText("あいこ！");
        } else if ((you + 1 == com) || (you == 2 && com == 0)) {
            win++;
            message.setText("あなたの勝ち！");
        } else {
            lose++;
            message.setText("あなたの負け！");
        }
        setVisible(true);    // 以上の出力結果を画面に反映する
    }
}

