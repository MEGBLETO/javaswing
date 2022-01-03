package com.carnel;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame() ;
        frame.setTitle("Hello");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //Here iam using Jlabel to set a label
        JLabel label = new JLabel();

        label.setText("Success is on the way");
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setForeground(Color.red);

        //setting the text font
        label.setFont(new Font("MV Boli", Font.BOLD, 20));

        ImageIcon image = new ImageIcon("600px-Instagram_icon.png");


        label.setIcon(image);

        frame.add(label);


           //MyFrame myframe = new MyFrame();
    }
}
