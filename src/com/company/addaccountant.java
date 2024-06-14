package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addaccountant extends JFrame implements ActionListener {
    TextField tf,tf1,tf2,tf3;
    addaccountant(){
        setTitle("AddAccountant");
        Label l0 = new Label("Add Accountant");
        l0.setBounds(75,45,150,20);
        l0.setFont(new Font("Arial", Font.BOLD, 13));
        add(l0);

        Label l = new Label("Name");
        l.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l);
        l.setVisible(true);
         tf = new TextField(10);
        l.setBounds(40,80,100,50);
        tf.setBounds(140,90,100,25);
        add(tf);

         tf1 = new TextField(10);
        Label l1 = new Label("Password");
//        tf1.setEchoChar('*');
        l1.setBounds(40,120,100,50);
        tf1.setBounds(140,130,100,25);
        l1.setFont(new Font("Raleway", Font.BOLD, 12));
        add(tf1);
        add(l1);

         tf2 = new TextField(15);
        Label l2 = new Label("Email");
        l2.setBounds(40,160,100,50);
        tf2.setBounds(140,170,100,25);

        l2.setFont(new Font("Raleway", Font.BOLD, 12));
        add(tf2);
        add(l2);

        tf3 = new TextField(10);
        Label l3 = new Label("Mobile no:");

        l3.setBounds(40,200,100,50);
        tf3.setBounds(140,210,100,25);

        l3.setFont(new Font("Raleway", Font.BOLD, 12));
        add(tf3);
        add(l3);

        Button b = new Button("Add");
        b.setBounds(40,280,50,20);
        add(b);
        Button b1 = new Button("Clear");
        b1.setBounds(110,280,50,20);
        add(b1);
        Button b2 = new Button("Back");
        b2.setBounds(180,280,50,20);
        add(b2);



        setSize(300,400);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);

    }
    public void actionPerformed(ActionEvent ae) {
        String Str = ae.getActionCommand();

        if (Str.equals("Back")) {
            AdminSection obj = new AdminSection();

        }
        if (Str.equals("Clear")) {
            tf.setText("");
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");

            JOptionPane.showMessageDialog(this,"Text clear successfully");
        }
    }


    public static void main(String[] args) {
        addaccountant obj =new addaccountant();
    }

}
