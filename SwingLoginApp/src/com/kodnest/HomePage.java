package com.kodnest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage {
	HomePage() {

        JFrame f = new JFrame("Home Page");

        JLabel l = new JLabel("Welcome to Home Page!");

        l.setBounds(80, 80, 250, 40);

        JButton b = new JButton("Logout");

        b.setBounds(120, 150, 100, 30);

        b.addActionListener(e -> {

            f.dispose();

            LoginPage.main(null);

        });

        f.add(l);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
