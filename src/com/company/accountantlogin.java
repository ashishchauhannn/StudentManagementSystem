package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class accountantlogin extends JFrame implements ActionListener {
    TextField tf,tf1;
    accountantlogin() {
        setTitle("Accountant Login");
        Label l0 = new Label("Accountant Login Section");
        l0.setBounds(60, 45, 150, 20);
        l0.setFont(new Font("Arial", Font.BOLD, 12));
        add(l0);

        Label l = new Label("Username");
        l.setBounds(40, 80, 80, 50);
        l.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l);
        l.setVisible(true);
        tf = new TextField(10);
        tf.setBounds(140, 90, 60, 25);
        add(tf);


        tf1 = new TextField(10);
        Label l1 = new Label("Password");
        tf1.setEchoChar('*');
        tf1.setBounds(140, 140, 60, 25);
        l1.setBounds(40, 130, 80, 50);
        l1.setFont(new Font("Raleway", Font.BOLD, 12));
        add(tf1);
        add(l1);


        Button b = new Button("Login");
        b.setFont(new Font("Arial", Font.BOLD, 12));

        b.setBounds(80, 190, 40, 20);
        add(b);
        Button b1 = new Button("Back");
        b1.setFont(new Font("Arial", Font.BOLD, 12));

        b1.setBounds(150, 190, 40, 20);
        add(b1);


        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        b1.addActionListener((ActionListener) this);
        b.addActionListener((ActionListener) this);

    }
    public void actionPerformed(ActionEvent ae) {

        String Str = ae.getActionCommand();
        String username = tf.getText();
        String password= tf1.getText();

        if (Str.equals("Login")) {
            if (username.trim().equals("sagar") && password.trim().equals("1430")) {
                AccountantSection obj = new AccountantSection();
                JOptionPane.showMessageDialog(this, "login successfull!");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter correct details!");
            }


        }
        if(Str.equals("Back")){
            login obj = new login();
        }

    }


    public static void main(String[] args) {
        accountantlogin obj = new accountantlogin();
}
    }
