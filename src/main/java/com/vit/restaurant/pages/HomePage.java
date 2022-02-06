package com.vit.restaurant.pages;

import java.awt.*; 
import java.awt.event.*;  
import javax.swing.*;

public class HomePage{

public HomePage(){

    JFrame f= new JFrame();
    JButton b1 = new JButton("Orders");
    JButton b2 = new JButton("ManageMenuItems");
    JButton b3 = new JButton("Order Details");
    JButton b4 = new JButton("Report");

    b1.setBounds(600, 150, 150, 50);
    b2.setBounds(600, 250, 150, 50);
    b3.setBounds(600, 350, 150, 50);
    b4.setBounds(600, 450, 150, 50);    
    
    b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            new Orders();
    }   
    });  
    
    b2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            new ManageItems();
    }   
    });


    f.add(b1);f.add(b2);f.add(b3);f.add(b4);
    f.setSize(1650, 1080);
    f.setLayout(null);
    f.setVisible(true);
    
}
}