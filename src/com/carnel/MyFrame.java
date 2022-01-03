package com.carnel;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Carnel is learning");
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.ORANGE);

        JLabel label = new JLabel();
        label.setText("Hello, Carnel your are on your way to success");
         this.add(label);
    }

}
