package com.vit.restaurant.pages;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

public class HomePage {
  

  public HomePage() {

    JFrame homeFrame;
  JButton orderBttn;
  JButton managemenuBttn;
  JButton orderdetailsBttn;
  JButton paymentBttn;
    homeFrame = new JFrame("Home page");
    orderBttn = new JButton("order");
    orderBttn.setBounds(675, 150, 100, 40);
    managemenuBttn = new JButton("managemenu");
    managemenuBttn.setBounds(675, 200, 100, 40);
    orderdetailsBttn = new JButton("order");
    orderdetailsBttn.setBounds(675, 250, 100, 40);
    paymentBttn = new JButton("payment");
    paymentBttn.setBounds(675, 300, 100, 40);
    managemenuBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
           
            homeFrame.dispose();
            new ManageItems();
        }
      });

    

    JLabel loginTitle = new JLabel(" restaurant System");
    loginTitle.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
    loginTitle.setBorder(new EmptyBorder(10, 10, 10, 10));
    loginTitle.setBounds(600, 25, 400, 40);
    JLabel title = new JLabel("Home Page");
    title.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
    title.setBorder(new EmptyBorder(10, 10, 10, 10));
    title.setBounds(650, 85, 400, 40);
    homeFrame.add(loginTitle);
    homeFrame.add(title);
    homeFrame.add(orderBttn);
    homeFrame.add(orderdetailsBttn);
    homeFrame.add(managemenuBttn);
    homeFrame.add(paymentBttn);
    homeFrame.setSize(1650, 1080);

    homeFrame.setLayout(null);
    homeFrame.setVisible(true);
  }
}
