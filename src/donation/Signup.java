/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donation;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author harry sahani
 */
public class Signup  extends JFrame implements ActionListener{
    JButton submit,back;
    JTextField txt,txt1,txt2,txt3;
    Choice security;
    JLabel text;
    JPanel jp1;
    
    Signup(){
        setBounds(230,20,1000,700);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/signup.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,1000,700);
        add(img);

        
        JLabel username = new JLabel("USERNAME :-");
        username.setBounds(330,260,125,25);
        username.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(username);
        txt = new JTextField();
        txt.setBounds(430,260,180,25);
        txt.setBorder(BorderFactory.createEmptyBorder());
        txt.setCursor(new Cursor(HAND_CURSOR));
        img.add(txt);
        
        JLabel name = new JLabel("NAME :-");
        name.setBounds(330,300,125,25);
        name.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(name);
        txt1 = new JTextField();
        txt1.setBounds(430,300,180,25);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        txt1.setCursor(new Cursor(HAND_CURSOR));
        img.add(txt1);
        
        JLabel password = new JLabel("PASSWORD :-");
        password.setBounds(330,340,125,25);
        password.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(password);
        txt2 = new JTextField();
        txt2.setBounds(430,340,180,25);
        txt2.setBorder(BorderFactory.createEmptyBorder());
        txt2.setCursor(new Cursor(HAND_CURSOR));
        img.add(txt2);
        
       
        JLabel sec = new JLabel("SECURITY :-");
        sec.setBounds(330,380,100,25);
        sec.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(sec);
        
        security = new Choice();
        security.add("Your date of birth time");
        security.add("Your fav superhero");
        security.add("Your fav place");
        security.add("Your fav book");
        security.add("Your fav movie");
        security.setBounds(430,380,180,25);
        security.setCursor(new Cursor(HAND_CURSOR));
        img.add(security);
        
        
        JLabel ans = new JLabel("ANSWER :-");
        ans.setBounds(330,420,125,25);
        ans.setFont(new Font("ARIAL", Font.BOLD,12));
        img.add(ans);
        txt3 = new JTextField();
        txt3.setBounds(430,420,180,25);
        txt3.setBorder(BorderFactory.createEmptyBorder());
        txt3.setCursor(new Cursor(HAND_CURSOR));
        img.add(txt3);
        
        
        
        ImageIcon feed = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\submit.png");
        submit = new JButton("SUBMIT", feed);
        submit.setBackground(Color.pink);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("ARIAL", Font.BOLD,12));
        submit.setBounds(350,470,120,30);
        submit.setCursor(new Cursor(HAND_CURSOR));
        submit.addActionListener(this);
        img.add(submit);
        
        
        
        ImageIcon bak = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\previous.png");
        back = new JButton("BACK", bak);
        back.setBackground(Color.pink);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("ARIAL", Font.BOLD,12));
        back.setBounds(490,470,120,30);
        back.setCursor(new Cursor(HAND_CURSOR));
        back.addActionListener(this);
        img.add(back); 
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String username = txt.getText();
            String name = txt1.getText();
            String password = txt2.getText();
            String question = security.getSelectedItem();
            String ans = txt3.getText();
            
            String query = "insert into signup values( '"+username+"','"+name+"','"+password+"','"+question+"','"+ans+"')";
            
            try {
                Conn c= new Conn();
                c.st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account created successfull");
                setVisible(false);
                new Login();
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
        
    }
    
    public static void main(String[] args) {
        new Signup();
    }
    
}
