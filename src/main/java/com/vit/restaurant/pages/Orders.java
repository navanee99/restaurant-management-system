package com.vit.restaurant.pages;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;

import net.miginfocom.layout.Grid;

import java.awt.*;
import java.awt.event.*;

public class Orders{
    JLabel la1,la2,la3,la4,la5,la6,la7,la8,la9,sla1,sla2,sla3,sla4,sla5,sla6,sla7,sla8,sla9;
    JButton fb1,ffb2,db3,fsb1 ,fsb2,fsb3,fsb4,fsb5,fsb6,fsb7,fsb8,fsb9;
        
        public Orders(){

        // JPanel panel1, panel2, btnpanel;    

        JFrame f= new JFrame();    
        // Border orange = BorderFactory.createLineBorder(Color.orange);
        // panel1=new JPanel();   




        // btnpanel = new JPanel(new GridLayout(1,3));
        // btnpanel.add(fb1); 
        // btnpanel.add(ffb2);
        // btnpanel.add(db3);  
        // panel1.add(btnpanel);
        fb1 = new JButton("Foods");
        ffb2 = new JButton("Fast Foods");
        db3 = new JButton("Drinks");
        // fb1.setBackground(Color.WHITE);
        // ffb2.setBackground(Color.WHITE);
        // db3.setBackground(Color.WHITE);
        fb1.setBounds(80, 50, 150, 30);
        ffb2.setBounds(230, 50, 150, 30);
        db3.setBounds(380, 50, 150, 30);
        
        fsb1 = new JButton("ADD");
        fsb2 = new JButton("ADD");
        fsb3 = new JButton("ADD");
        fsb4 = new JButton("ADD");
        fsb5 = new JButton("ADD");
        fsb6 = new JButton("ADD");
        fsb7 = new JButton("ADD");
        fsb8 = new JButton("ADD");
        fsb9 = new JButton("ADD");
        
        
        fsb1.setBackground(Color.blue);
        fsb2.setBackground(Color.blue);
        fsb3.setBackground(Color.blue);
        fsb4.setBackground(Color.blue);
        fsb5.setBackground(Color.blue);
        fsb6.setBackground(Color.blue);
        fsb7.setBackground(Color.blue);
        fsb8.setBackground(Color.blue);
        fsb9.setBackground(Color.blue);

        
        // panel1.setBorder(orange);    

                
        la1 = new JLabel();
        la2 = new JLabel();
        la3 = new JLabel();
        la4 = new JLabel();
        la5 = new JLabel();
        la6 = new JLabel();
        la7 = new JLabel();
        la8 = new JLabel();
        la9 = new JLabel();
        sla1 = new JLabel();
        sla2 = new JLabel();
        sla3 = new JLabel();
        sla4 = new JLabel();
        sla5 = new JLabel();
        sla6 = new JLabel();
        sla7 = new JLabel();
        sla8 = new JLabel();
        sla9 = new JLabel();

        // panel1.add(c1);
        // panel1.add(c2);
        // panel1.add(c3);

        
        fb1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               

                // c1.setBounds(80,100,150,50);
                // c2.setBounds(80,140,150,50);
                // c3.setBounds(80,180,150,50);        
                // c1.setText(" Thadoori");
                // c2.setText(" Thadoori");
                // c3.setText(" Thadoori");
               
                la1.setBounds(80,100,150,50);
                la2.setBounds(80,140,150,50);
                la3.setBounds(80,180,150,50);        
                la1.setText(" Thadoori1");
                la2.setText(" Thadoori2");
                la3.setText(" Thadoori3");
                fsb1.setBounds(250, 110, 80, 30);
                fsb2.setBounds(250, 150, 80, 30);
                fsb3.setBounds(250, 190, 80, 30);
                la1.setVisible(true);
                la2.setVisible(true);
                la3.setVisible(true);
                la4.setVisible(false);
                la5.setVisible(false);
                la6.setVisible(false);
                la7.setVisible(false);
                la8.setVisible(false);
                la9.setVisible(false);
                sla1 = new JLabel();
                sla2 = new JLabel();
                sla3 = new JLabel();
                
                fsb1.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){
                        sla1.setBounds(900,100,150,50);  
                        sla1.setText(" Thadoori1");       
                        sla1.setVisible(true);
                        sla2.setVisible(false);
                        sla3.setVisible(false);            
                    }
                });  
                fsb2.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                     
                        sla2.setBounds(900,140,150,50);
                        sla2.setText(" Thadoori2");
                        sla1.setVisible(false);
                        sla2.setVisible(true);
                        sla3.setVisible(false);
                    }
                });  

                fsb3.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                     
                        sla3.setBounds(900,180,150,50);
                        sla3.setText(" Thadoori3");
                        sla1.setVisible(false);
                        sla2.setVisible(false);
                        sla3.setVisible(true);
                    }
                });  
                

}
});  

        ffb2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               

                // c1.setBounds(80,100,150,50);
                // c2.setBounds(80,140,150,50);
                // c3.setBounds(80,180,150,50);        
                // c1.setText(" Thadoori2");
                // c2.setText(" Thadoori2");
                // c3.setText(" Thadoori2");
               
                la4.setBounds(80,100,150,50);
                la5.setBounds(80,140,150,50);
                la6.setBounds(80,180,150,50);        
                la4.setText(" Thadoori4");
                la5.setText(" Thadoori5");
                la6.setText(" Thadoori6");
                fsb4.setBounds(250, 110, 80, 30);
                fsb5.setBounds(250, 150, 80, 30);
                fsb6.setBounds(250, 190, 80, 30);
                la1.setVisible(false);
                la2.setVisible(false);
                la3.setVisible(false);
                la4.setVisible(true);
                la5.setVisible(true);
                la6.setVisible(true);
                la7.setVisible(false);
                la8.setVisible(false);
                la9.setVisible(false);

                
                              
   }
});  

        db3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
            

                // c1.setBounds(80,100,150,50);
                // c2.setBounds(80,140,150,50);
                // c3.setBounds(80,180,150,50);        
                // c1.setText(" Thadoori3");
                // c2.setText(" Thadoori3");
                // c3.setText(" Thadoori3");
        
                la7.setBounds(80,100,150,50);
                la8.setBounds(80,140,150,50);
                la9.setBounds(80,180,150,50);        
                la7.setText(" Thadoori7");
                la8.setText(" Thadoori8");
                la9.setText(" Thadoori9");
                fsb7.setBounds(250, 110, 80, 30);
                fsb8.setBounds(250, 150, 80, 30);
                fsb9.setBounds(250, 190, 80, 30);
                la1.setVisible(false);
                la2.setVisible(false);
                la3.setVisible(false);
                la4.setVisible(false);
                la5.setVisible(false);
                la6.setVisible(false);
                la7.setVisible(true);
                la8.setVisible(true);
                la9.setVisible(true);

               
}
});  

        


            




        // panel2=new JPanel();  
        JLabel l2 = new JLabel("Ordered Items");
        l2.setFont(new FontUIResource("Verdana",Font.PLAIN,10));
        l2.setBounds(950,50,150,50);
        // panel2.add(l2);    
        // panel2.setBorder(orange);    
                
        
        
        
        
        
        
        f.add(fb1);f.add(ffb2);f.add(db3);f.add(l2); 
        // f.add(c1);f.add(c2);f.add(c3);
        f.add(la1);f.add(la2);f.add(la3);f.add(la4);f.add(la5);f.add(la6);f.add(la7);f.add(la8);f.add(la9);
        f.add(sla1);f.add(sla2);f.add(sla3);
        // f.add(sla4);f.add(sla5);f.add(sla6);f.add(sla7);f.add(sla8);f.add(sla9);
        f.add(fsb1);f.add(fsb2);f.add(fsb3);f.add(fsb4);f.add(fsb5);f.add(fsb6);f.add(fsb7);f.add(fsb8);f.add(fsb9);
        
        f.setSize(1650, 1080);
        f.setLayout(null);
        f.setVisible(true);       


    
    }  


}      


