package com.vit.restaurant.pages;
<<<<<<< HEAD
import javax.swing.JButton;    
import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.FontUIResource;
import java.awt.Dimension;
public class ManageItems {
   public ManageItems(){
=======

import javax.swing.JButton;    
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
    public class  ManageItems{ 
    
        ManageItems(){
>>>>>>> 4d1bbbc811ab6b70434850d5557cafea4b994ec9
    
        JFrame frame = new JFrame("ABC restaurant");    
        String data[][]={ {"1","idly","1"},    
                              {"2","meals","35"},    
                              {"3","sambar rice","45"},
<<<<<<< HEAD
                              {"4","pongal","40"}
=======
                              {"4","pongal","40"},
>>>>>>> 4d1bbbc811ab6b70434850d5557cafea4b994ec9
                              
                            };    
        String column[]={"S.NO","DISH","PRICE"};
        JTable table;         
        table =new JTable(data,column);
        JScrollPane scrollpane;
<<<<<<< HEAD
        scrollpane =new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS ); 
        table.setPreferredScrollableViewportSize(new Dimension(420, 250));
        table.setFillsViewportHeight(true);
=======
        scrollpane =new JScrollPane(table,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ); 
>>>>>>> 4d1bbbc811ab6b70434850d5557cafea4b994ec9
        
    
        JButton addButton,removeButton,backButton,logoutButton;
        addButton = new JButton("Add");
<<<<<<< HEAD
        addButton.setBounds(600, 500, 100, 60);
        removeButton = new JButton("Remove");
        removeButton.setBounds(600, 550, 100, 60);
        backButton = new JButton("Back");
        backButton.setBounds(600, 600, 100, 60);
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(600, 650, 100, 60);
=======
        addButton.setBounds(1500, 500, 100, 60);
        removeButton = new JButton("Remove");
        removeButton.setBounds(1500, 550, 100, 60);
        backButton = new JButton("Back");
        backButton.setBounds(1500, 600, 100, 60);
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(1500, 650, 100, 60);
>>>>>>> 4d1bbbc811ab6b70434850d5557cafea4b994ec9
        table.setBounds(30,40,200,300);          
            
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(backButton);
<<<<<<< HEAD
        frame.add(logoutButton); 
        frame.add(table) ;
        frame .add(scrollpane) ;
        frame.setSize(1650, 1080); 
        frame.setLayout(null);   
=======
        frame.add(logoutButton);   
        frame.setSize(300,400);    
>>>>>>> 4d1bbbc811ab6b70434850d5557cafea4b994ec9
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    
        }   
        public static void main(String[] args) {
            new ManageItems();
        }
    
<<<<<<< HEAD
    
}
=======
    }
>>>>>>> 4d1bbbc811ab6b70434850d5557cafea4b994ec9
