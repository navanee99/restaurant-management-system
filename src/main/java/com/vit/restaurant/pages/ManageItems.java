package com.vit.restaurant.pages;

import javax.swing.JButton;    
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
    public class  ManageItems{ 
    
        ManageItems(){
    
        JFrame frame = new JFrame("ABC restaurant");    
        String data[][]={ {"1","idly","1"},    
                              {"2","meals","35"},    
                              {"3","sambar rice","45"},
                              {"4","pongal","40"},
                              
                            };    
        String column[]={"S.NO","DISH","PRICE"};
        JTable table;         
        table =new JTable(data,column);
        JScrollPane scrollpane;
        scrollpane =new JScrollPane(table,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ); 
        
    
        JButton addButton,removeButton,backButton,logoutButton;
        addButton = new JButton("Add");
        addButton.setBounds(1500, 500, 100, 60);
        removeButton = new JButton("Remove");
        removeButton.setBounds(1500, 550, 100, 60);
        backButton = new JButton("Back");
        backButton.setBounds(1500, 600, 100, 60);
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(1500, 650, 100, 60);
        table.setBounds(30,40,200,300);          
            
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(backButton);
        frame.add(logoutButton);   
        frame.setSize(300,400);    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    
        }   
        public static void main(String[] args) {
            new ManageItems();
        }
    
    }
