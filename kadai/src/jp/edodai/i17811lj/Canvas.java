package jp.edodai.i17811lj;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    Color color=null;
    public Canvas(Color color){
        this.color=color;
    }

    @Override
    protected void paintComponent(Graphics g) {

//        g.setColor(Color.white);
//        g.fillRect(50,20,200,150);
//        g.setColor(Color.red);
//        g.fillArc(100,45,100,100,0,360);
        g.setColor(this.color);
        g.drawRect(0,0,100,100);
        g.setColor(Color.red);
        g.fillOval(15,25,20,20);
        g.fillOval(65,25,20,20);
        g.fillRect(37,75,25,5);
    }


}

