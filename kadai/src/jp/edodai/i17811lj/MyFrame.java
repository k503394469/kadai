package jp.edodai.i17811lj;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title,int width,int height){
        super(title);
//        this.setTitle(title);
        this.setSize(width,height);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
    MyFrame(String title,int width,int height,int x, int y){
        super(title);
        this.setSize(width,height);
        this.setLocation(x,y);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
