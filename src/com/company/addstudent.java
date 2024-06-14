package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;

public class addstudent extends JFrame implements ActionListener {

    TextField tf0,tf, tf1 ,tf2,tf3,tf4;
    TextArea ta;
    addstudent(){
        setTitle("AddStudent");
        Label l00 = new Label("Add Student Details");
        l00.setBounds(75, 20, 150, 20);
        l00.setFont(new Font("Arial", Font.BOLD, 13));
        add(l00);

        Label l0 = new Label("Name");
        l0.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l0);
        tf0 = new TextField(10);
        l0.setBounds(40, 40, 100, 50);
        tf0.setBounds(140, 45, 100, 25);
        add(tf0);

        Label l = new Label("SID");
        l.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l);
        tf = new TextField(10);
        l.setBounds(40, 80, 100, 50);
        tf.setBounds(140, 85, 100, 25);
        add(tf);

        Label l1 = new Label("Course");
        l1.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l1);
        tf1 = new TextField(10);
        l1.setBounds(40, 115, 100, 50);
        tf1.setBounds(140, 125, 100, 25);
        add(tf1);
        Label l2 = new Label("Mobile no");
        l2.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l2);
        tf2 = new TextField(10);
        l2.setBounds(40, 160, 100, 50);
        tf2.setBounds(140, 165, 100, 25);
        add(tf2);

        Label l3 = new Label("City");
        l3.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l3);
        tf3 = new TextField(10);
        l3.setBounds(40, 200, 100, 50);
        tf3.setBounds(140, 205, 100, 25);
        add(tf3);
        Label l4 = new Label("State");
        l4.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l4);
        tf4 = new TextField(10);
        l4.setBounds(40, 240, 100, 50);
        tf4.setBounds(140, 245, 100, 25);
        add(tf4);


        Label l5 = new Label("Address");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l5);
        ta = new TextArea();
        l5.setBounds(40, 280, 50, 50);
        ta.setBounds(140, 285, 180, 100);
        add(ta);

        Button b = new Button("Add");
        b.setBounds(40,400,50,20);
        b.setFont(new Font("Raleway", Font.BOLD, 12));
        add(b);
        Button b1 = new Button("Clear");
        b1.setBounds(110,400,50,20);
        b1.setFont(new Font("Raleway", Font.BOLD, 12));
        add(b1);
        Button b2 = new Button("Back");
        b2.setBounds(180,400,50,20);
        b2.setFont(new Font("Raleway", Font.BOLD, 12));
        add(b2);

        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
        b.addActionListener((ActionListener) this);

        setSize(350, 500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent ae) {
        String Str = ae.getActionCommand();
        if(Str.equals("Back")){
            AdminSection obj = new AdminSection();
        }

        if (Str.equals("Clear")) {
            tf.setText("");
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf0.setText("");
             ta.setText("");
             JOptionPane.showMessageDialog( this,"text clear succesfully");
        }
    }
    public static void main(String[] args) {
        addstudent obj = new addstudent();
    }
}
