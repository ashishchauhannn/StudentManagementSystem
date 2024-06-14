package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSection extends JFrame implements ActionListener {
    AdminSection(){
        setTitle("AdminSection");
        setSize(330,300);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);

        Label l = new Label("Admin Section");
        add(l);
        l.setBounds(100,20,150,50);
        l.setVisible(true);
        l.setFont(new Font("Arial" ,Font.BOLD, 13));


        Button b = new Button("Add Accountant");
        b.setBounds(100,100,100,30);
        b.setFont(new Font("Raleway", Font.BOLD, 12));
        add(b);

        Button b1 = new Button("View Accountant");
        b1.setFont(new Font("Raleway", Font.BOLD, 12));
        b1.setBounds(100,150,100,30);
        add(b1);

        Button b2 = new Button("Logout");
        b2.setFont(new Font("Raleway", Font.BOLD, 12));
        b2.setBounds(100,200,100,30);
        add(b2);
        b.addActionListener((ActionListener) this);
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);


    }
    public void actionPerformed(ActionEvent ae) {
        String Str = ae.getActionCommand();
        String Str1 = ae.getActionCommand();
        if (Str.equals("Logout")) {
            JOptionPane.showMessageDialog(this,"Logout succesfully");
            login obj = new login();
        }
            if (Str1.equals("Add Accountant")) {
                addaccountant obj = new addaccountant();
            }
        }


    public static void main(String[] args) {
     AdminSection obj = new AdminSection();

    }

}
