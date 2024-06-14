package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class login extends JFrame implements ActionListener {

    login() {
        setTitle("Welcome");
        setSize(300, 300);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);


        Label l = new Label("Chose your login");
        add(l);
        l.setBounds(80, 40, 150, 50);
        l.setVisible(true);
        l.setFont(new Font("Arial", Font.BOLD, 13));


        Button b = new Button("Admin");
        b.setBounds(100, 100, 80, 30);
        b.setFont(new Font("Arial", Font.BOLD, 12));
        add(b);

        Button b1 = new Button("Accountant");
        b1.setFont(new Font("Arial", Font.BOLD, 12));
        b1.setBounds(100, 160, 80, 30);
        add(b1);
        b.addActionListener((ActionListener) this);
        b1.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent ae) {
        String Str = ae.getActionCommand();
        if (Str.equals("Admin")) {
            adminlogin obj = new adminlogin();
        }
        if (Str.equals("Accountant")) {
            accountantlogin obj = new accountantlogin();
        }
    }
    public static void main(String[] args) {
        login obj = new login();

    }
}
