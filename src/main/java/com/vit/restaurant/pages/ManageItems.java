package com.vit.restaurant.pages;

import javax.swing.JButton;    
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
        table.setPreferredScrollableViewportSize(new Dimension(420, 250));
        table.setFillsViewportHeight(true);
        JButton addButton,removeButton,backButton,logoutButton;
        addButton = new JButton("Add");
        addButton.setBounds(500, 500, 100, 60);
        removeButton = new JButton("Remove");
        removeButton.setBounds(500, 550, 100, 60);
        backButton = new JButton("Back");
        backButton.setBounds(500, 600, 100, 60);
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(500, 650, 100, 60);
        table.setBounds(30,40,200,300);          
            
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(backButton);
        frame.add(logoutButton);
        frame.add(table);
        frame.add(scrollpane);
        frame.setSize(300,400);    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    
        }   
        public static void main(String[] args) {
            new ManageItems();
        }
    
    }