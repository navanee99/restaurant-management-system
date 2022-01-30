package com.vit.restaurant.pages;

import javax.swing.JButton;    
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Dimension;
    public class  ManageItems{ 
    
        ManageItems(){
    
        JFrame frame = new JFrame("ABC restaurant");    
        String data[][]={ {"1","idly","1"},    
                              {"2","meals","35"},    
                              {"3","sambar rice","45"},
                              {"4","pongal","40"}
                              
                            };    
        String column[]={"S.NO","DISH","PRICE"};
        JTable table;         
        table =new JTable(data,column);
        JScrollPane scrollpane;
        scrollpane =new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS ); 
        table.setPreferredScrollableViewportSize(new Dimension(450, 250));
        table.setFillsViewportHeight(true);

        JButton addButton,removeButton,backButton,logoutButton;
        addButton = new JButton("Add");
        addButton.setBounds(900, 500, 100, 30);
        removeButton = new JButton("Remove");
        removeButton.setBounds(900, 550, 100, 30);
        backButton = new JButton("Back");
        backButton.setBounds(900, 30, 100, 30);
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(900, 80, 100, 30);
        table.setBounds(90,100,500,600);     
       
            
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(backButton);
        frame.add(logoutButton);
        frame.add(table);
        frame.add(scrollpane,BorderLayout.CENTER);
        
        frame.setSize(1650, 1080);    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

         
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
            
                new HomePage();
            }
          });
    
        }   
        public static void main(String[] args) {
            new ManageItems();
        }
    
    }