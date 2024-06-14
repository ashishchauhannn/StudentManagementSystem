package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class adminlogin extends JFrame implements ActionListener {

    TextField tf,tf1;
    Label l0,l1,l;
    Button b,b1;

    adminlogin() {
        setTitle("Admin Login");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
         l0 = new Label("Admin Login Section");
        l0.setBounds(75, 45, 130, 20);
        l0.setFont(new Font("Arial", Font.BOLD, 12));
        add(l0);

         l = new Label("Username");
        l.setBounds(40, 80, 80, 50);
        l.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l);
        l.setVisible(true);
        tf = new TextField(10);
        tf.setBounds(140, 90, 60, 25);
        add(tf);


           tf1 = new TextField(10);
         l1 = new Label("Password");
        tf1.setEchoChar('*');
        tf1.setBounds(140, 140, 60, 25);
        l1.setBounds(40, 130, 80, 50);
        l1.setFont(new Font("Raleway", Font.BOLD, 12));
        add(tf1);
        add(l1);



        Button b = new Button("Login");
        b.setBounds(80, 190, 40, 20);
        b.setFont(new Font("Arial", Font.BOLD, 12));

        add(b);
        Button b1 = new Button("Back");
        b1.setBounds(150, 190, 40, 20);
        b1.setFont(new Font("Arial", Font.BOLD, 12));

        add(b1);

        b.addActionListener((ActionListener) this);
        b1.addActionListener((ActionListener) this);

    }



    public void actionPerformed(ActionEvent ae) {

        String Str = ae.getActionCommand();
        String username = tf.getText();
        String password= tf1.getText();

        if (Str.equals("Login")) {
            if (username.trim().equals("ashish") && password.trim().equals("1234")) {
                AdminSection obj = new AdminSection();
                JOptionPane.showMessageDialog(this, "login successfully Mr." +""+ username+"");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter correct details!");
            }


        }
       if(Str.equals("Back")){
           login obj = new login();
        }

    }



public static void main(String[] args) {
        adminlogin obj = new adminlogin();
    }
}



