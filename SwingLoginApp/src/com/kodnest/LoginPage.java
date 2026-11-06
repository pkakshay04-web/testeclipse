package com.kodnest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginPage {
	public static void main(String[] args) {
		
    JFrame f = new JFrame("Login Page");

    JLabel l1 = new JLabel("Username:");
    l1.setBounds(50, 50, 100, 30);

    JTextField t1 = new JTextField();
    t1.setBounds(150, 50, 150, 30);

    JLabel l2 = new JLabel("Password:");
    l2.setBounds(50, 100, 100, 30);

    JPasswordField t2 = new JPasswordField();
    t2.setBounds(150, 100, 150, 30);

    JButton b = new JButton("Login");
    b.setBounds(150, 160, 100, 30);

    // Button click event
    b.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            String username = t1.getText();
            String password = new String(t2.getPassword());

            if(username.equals("admin") &&
               password.equals("1234")) {

                JOptionPane.showMessageDialog(f,
                    "Login Successful");

                // Open next page
                new HomePage();

                // Close login page
                f.dispose();

            } else {

                JOptionPane.showMessageDialog(f,
                    "Invalid Username or Password");

            }
        }
    });

    f.add(l1);
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(b);

    f.setSize(400, 300);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
}
}