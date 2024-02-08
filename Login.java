package bank.management.system;
import java.awt.Color;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;




public class Login extends JFrame implements ActionListener {
     
    JButton login, signup, clear;
            JTextField cardTextField;
            JPasswordField pinTextField;

    
    
    
    Login(){ 
        setTitle("AUTOMATED TELLER MACHINE");
 
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add (label);
        
        JLabel text = new JLabel ("Welcome to ATM");
        text.setFont(new Font("osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel ("Card No");
        cardno.setFont(new Font("Raleway", Font.BOLD,38));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD ,14)); 
        add(cardTextField);
        
        JLabel pin = new JLabel ("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD,38));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
         login = new JButton("SIGN IN");
         login.setBackground(Color.black);
         login.setBounds(300,300,100,30);
         login.setForeground(Color.white);
         login.addActionListener(this);
         add(login);
         
         clear = new JButton("CLEAR");
         clear.setBackground(Color.black);
         clear.setBounds(430,300,100,30);
         clear.setForeground(Color.white);
         clear.addActionListener(this);
         add(clear);
         
         signup = new JButton("SIGN UP");
         signup.setBackground(Color.black);
         signup.setBounds(300,350,230,30);
         signup.setForeground(Color.white);
         signup.addActionListener(this);
         add(signup);
         
                
                
        getContentPane().setBackground(Color.white);
        
        
        
        

       setSize(800,480);
       setVisible(true);
       setLocation(350,200);
        
    }
   
    
       @Override
       public void actionPerformed(ActionEvent ae){
           try{
           if (ae.getSource() == clear){
             Conn c1 = new Conn();
              String cardno = cardTextField.getText("");
              String pin = pinTextField.getText("");
               
           }
           else if (ae.getSource() == login){
               
           }
           else if (ae.getSource() == signup ){
               setVisible(false);
               new SignupOne().setVisible(true);
               
           }
            }catch(Exception e){
            e.printStackTrace();
        }
    }
}
       
    
   public static void main(String args[]){
       new Login().setVisible(true);
       
   } 

    
}