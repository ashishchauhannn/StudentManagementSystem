package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountantSection extends JFrame implements ActionListener {
    AccountantSection() {
        setTitle("Accountant Login");
        setSize(350, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        Label l0 = new Label("Accountant Section");
        l0.setBounds(80,15,200,20);
        l0.setFont(new Font("Arial", Font.BOLD, 13));

        add(l0);

        Button b = new Button("Add Student");
        b.setBounds(30, 60, 100, 30);
        b.setFont(new Font("Arial", Font.BOLD, 12));
        add(b);

        Button b1 = new Button("View Student");
        b1.setBounds(30, 110, 100, 30);
        b1.setFont(new Font("Arial", Font.BOLD, 12));
        add(b1);

        Button b2 = new Button("Edit Student");
        b2.setBounds(180, 60,100,30);
        b2.setFont(new Font("Arial", Font.BOLD, 12));
        add(b2);

        Button b3 = new Button("Fee Details");
        b3.setBounds(180, 110, 100, 30);
        b3.setFont(new Font("Arial", Font.BOLD, 12));
        add(b3);

        Button b4 = new Button("Logout");
        b4.setBounds(110, 160, 100, 30);
        b4.setFont(new Font("Arial", Font.BOLD, 12));
        add(b4);

        b.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
        b3.addActionListener((ActionListener) this);
        b4.addActionListener((ActionListener) this);


    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("Add Student")){
            addstudent obj =new addstudent();
        }

    }

    public static void main(String[] args) {
        AccountantSection obj = new AccountantSection();
    }
}