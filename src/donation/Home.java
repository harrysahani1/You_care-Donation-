/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donation;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author harry sahani
 */
public class Home extends JFrame implements ActionListener{
    JPanel jp,jp1;
    JButton food,blood,cloth, login , signup;
    JLabel txt1, txt2;
    Home(){
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setLayout(null);
         
        jp= new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.white);
        jp.setBounds(0,0,1600,3000);
        add(jp);
        
        jp1= new JPanel();
        jp1.setLayout(null);
        jp1.setBackground(Color.cyan);
        jp1.setBounds(0,0,1600,70);
        jp.add(jp1);
        
        
        ImageIcon feed = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\food-donation.png");
        food = new JButton("FOOD DONATION", feed);
        food.setBounds(10,15,160,40);
        food.setBackground(Color.pink);
        food.setForeground(Color.black);
        food.setFont(new Font("ARIAL", Font.BOLD,10));
        food.setMargin(new Insets(0,0,0,20));
        food.setCursor(new Cursor(HAND_CURSOR));
        food.addActionListener(this);
        jp1.add(food);
        
        
        
        ImageIcon red = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\blood-bag.png");
        blood = new JButton("BLOOD DONATION", red);
        blood.setBounds(200,15,160,40);
        blood.setBackground(Color.pink);
        blood.setForeground(Color.black);
        blood.setFont(new Font("ARIAL", Font.BOLD,10));
        blood.setMargin(new Insets(0,0,0,20));
        blood.setCursor(new Cursor(HAND_CURSOR));
        blood.addActionListener(this);
        jp1.add(blood);
        
        
        
        ImageIcon dress = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\clothing.png");
        cloth = new JButton("CLOTH DONATION", dress);
        cloth.setBounds(400,15,160,40);
        cloth.setBackground(Color.pink);
        cloth.setForeground(Color.black);
        cloth.setFont(new Font("ARIAL", Font.BOLD,10));
        cloth.setMargin(new Insets(0,0,0,20));
        cloth.setCursor(new Cursor(HAND_CURSOR));
        cloth.addActionListener(this);
        jp1.add(cloth);
        
        
        ImageIcon Login = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\key.png");
        login = new JButton("LOGIN", Login);
        login.setBounds(1100,15,120,40);
        login.setBackground(new Color(245, 191, 42));
        login.setForeground(Color.black);
        login.setFont(new Font("ARIAL", Font.BOLD,10));
        login.setMargin(new Insets(0,0,0,20));
        login.setCursor(new Cursor(HAND_CURSOR));
        login.addActionListener(this);
        jp1.add(login);
        
        ImageIcon Signup = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\registration.png");
        signup = new JButton("SIGNUP", Signup);
        signup.setBounds(1240,15,120,40);
        signup.setBackground(new Color(245, 191, 42));
        signup.setForeground(Color.black);
        signup.setFont(new Font("ARIAL", Font.BOLD,10));
        signup.setMargin(new Insets(0,0,0,20));
        signup.setCursor(new Cursor(HAND_CURSOR));
        signup.addActionListener(this);
        jp1.add(signup);
        
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/childfood.jpg"));
        Image img2 =img1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(80,120,300,250);
        jp.add(img);
        
        
        txt1 = new JLabel("<html>Donating food is more than filling empty stomachs;\n"
                         + "it's nourishing souls with kindness and compassion. In every meal given,\n"
                         + "we sow seeds of hope, transforming hunger into possibility. It's a gesture that speaks\n"
                         + "volumes, transcending barriers and uniting hearts in empathy. Each donation is a beacon\n"
                         + "of light in someone's darkest hour, offering sustenance and solace. Through sharing what we have,\n"
                         + "we cultivate a community of abundance, where no one feels forgotten or alone. Together,\n"
                         + "let's feed not only bodies but also spirits, creating a world where generosity knows no bounds\n"
                         + "and everyone enjoys the blessing of a full plate.</html>");
        txt1.setBounds(450,80,800,300);
        txt1.setForeground(Color.BLACK);
        txt1.setFont(new Font("Santa Fe LET", Font.PLAIN,18));
        jp.add(txt1);
        
        
        ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("image/childblood.jpg"));
        Image img5 =img4.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon img6=new ImageIcon(img5);
        JLabel img7= new JLabel(img6);
        img7.setBounds(950,400,300,250);
        jp.add(img7);
        
        
        txt2 = new JLabel("<html>Donating blood is an act of profound generosity,\n"
                         + "a beacon of hope illuminating lives in need. With each donation,\n"
                         + "we offer a vital lifeline, a chance for healing and renewal. It's\n"
                         + "a selfless gesture, uniting us in a shared commitment to saving\n"
                         + "lives. In the pulse of every donor lies the power to make a\n"
                         + "difference, to transform fear into gratitude. Through our collective\n"
                         + "efforts, we forge bonds of compassion, stitching together a tapestry\n"
                         + "of strength and resilience. Let us donate blood, for in our veins\n"
                         + "flows the potential to bring light to someone's darkest hour.\n"
                         + "Together, we can make a life-saving impact, one donation at a time.</html>");
        txt2.setBounds(80,350,800,300);
        txt2.setForeground(Color.BLACK);
        txt2.setFont(new Font("Santa Fe LET", Font.PLAIN,18));
        jp.add(txt2);
        

        setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==food){
            setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "PLEASE LOGIN FIRST", "warning message", WIDTH);
            
        }else if(ae.getSource()==blood){
            setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "PLEASE LOGIN FIRST", "warning message", WIDTH);

            
        }else if(ae.getSource()==cloth){
            setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "PLEASE LOGIN FIRST", "warning message", WIDTH);
            
            
        }else if(ae.getSource()==login){
            setVisible(false);
            new Login();
            
        }
        else{
            new Signup();
        
    }
    }
    
    public static void main(String[] args) {
        
        new Home();
    }
    
}
