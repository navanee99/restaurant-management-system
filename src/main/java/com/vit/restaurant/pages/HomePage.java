package com.vit.restaurant.pages;

import javax.swing.*;

import java.awt.event.*;
public class HomePage{
    public static void main (String args[]){

        JFrame MainFrame = new JFrame("ABC restaurant");
        JButton b1 = new JButton("Order");
        JButton b2 = new JButton("Orderdetials");
        JButton b3 = new JButton("managemenu");
        JButton b4 = new JButton("payment");



        b1.setBounds (100,150,100,35);
        b2.setBounds(100,200,100,35);
        b3.setBounds(100,250,100,35);
        b4.setBounds(100,300,100,35);
      


        MainFrame.add(b1);
        MainFrame.add(b2);
        MainFrame.add(b3);
        MainFrame.add(b4);
        MainFrame.setSize(550,550);
        MainFrame.setLayout(null);
        MainFrame.setVisible(true);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
              new ManageItems();
      
              
              MainFrame.dispose();
      
            }
          });
    }
}

