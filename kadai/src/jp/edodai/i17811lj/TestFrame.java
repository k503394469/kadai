package jp.edodai.i17811lj;

import javax.swing.*;
import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        MyFrame f=new MyFrame("Test",600,450,20,20);
        f.add(new Canvas(Color.black));
        MyFrame f1=new MyFrame("Test1",600,450,20,20);
        f1.add(new Canvas(Color.yellow));
    }
}
