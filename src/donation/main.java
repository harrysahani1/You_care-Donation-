/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donation;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
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
public class main extends JFrame implements ActionListener{
    JPanel jp2,jp3;
    JButton food1,blood1,cloth1, signup1;
    JLabel txt3, txt4;
    main(){
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setLayout(null);
         
        jp2= new JPanel();
        jp2.setLayout(null);
        jp2.setBackground(Color.white);
        jp2.setBounds(0,0,1600,3000);
        add(jp2);
        
        jp3= new JPanel();
        jp3.setLayout(null);
        jp3.setBackground(Color.cyan);
        jp3.setBounds(0,0,1600,70);
        jp2.add(jp3);
        
        
        ImageIcon fed = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\food-donation.png");
        food1 = new JButton("FOOD DONATION", fed);
        food1.setBounds(10,15,160,40);
        food1.setBackground(Color.pink);
        food1.setForeground(Color.black);
        food1.setFont(new Font("ARIAL", Font.BOLD,10));
        food1.setMargin(new Insets(0,0,0,20));
        food1.setCursor(new Cursor(HAND_CURSOR));
        food1.addActionListener(this);
        jp3.add(food1);
          
        
        ImageIcon reed = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\blood-bag.png");
        blood1 = new JButton("BLOOD DONATION", reed);
        blood1.setBounds(200,15,160,40);
        blood1.setBackground(Color.pink);
        blood1.setForeground(Color.black);
        blood1.setFont(new Font("ARIAL", Font.BOLD,10));
        blood1.setMargin(new Insets(0,0,0,20));
        blood1.setCursor(new Cursor(HAND_CURSOR));
        blood1.addActionListener(this);
        jp3.add(blood1);
        
        
        
        ImageIcon dres = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\clothing.png");
        cloth1 = new JButton("CLOTH DONATION", dres);
        cloth1.setBounds(400,15,160,40);
        cloth1.setBackground(Color.pink);
        cloth1.setForeground(Color.black);
        cloth1.setFont(new Font("ARIAL", Font.BOLD,10));
        cloth1.setMargin(new Insets(0,0,0,20));
        cloth1.setCursor(new Cursor(HAND_CURSOR));
        cloth1.addActionListener(this);
        jp3.add(cloth1);
        
        
          
        ImageIcon Sign = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\logout.png");
        signup1 = new JButton("LOGOUT", Sign);
        signup1.setBounds(1230,15,130,40);
        signup1.setBackground(Color.pink);
        signup1.setForeground(Color.black);
        signup1.setFont(new Font("ARIAL", Font.BOLD,12));
        signup1.setMargin(new Insets(0,0,0,20));
        signup1.setCursor(new Cursor(HAND_CURSOR));
        signup1.addActionListener(this);
        jp3.add(signup1);

        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/donantion.jpg"));
        Image img2 =img1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(80,120,300,250);
        jp2.add(img);
        
        
        txt3 = new JLabel("<html>Generosity is not measured by what we give, but by the heart with which we give.\n"
                         + "Every contribution, no matter how small,\n"
                         + "has the power to make a difference. Together, let's sow the seeds of kindness and reap the fruits of compassion.\n"
                         + "volumes, transcending barriers and uniting hearts in empathy. Each donation is a beacon\n"
                         + "Your donation is not just a gift; it's a gesture of hope, a beacon of light for those in need. \n"
                         + "Thank you for your selflessness and for being a catalyst for positive change.</html>");
        txt3.setBounds(450,80,800,300);
        txt3.setForeground(Color.BLACK);
        txt3.setFont(new Font("Santa Fe LET", Font.PLAIN,18));
        jp2.add(txt3);
        
        
        ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("image/dress.jpg"));
        Image img5 =img4.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon img6=new ImageIcon(img5);
        JLabel img7= new JLabel(img6);
        img7.setBounds(950,400,300,250);
        jp2.add(img7);
        
        
        txt4 = new JLabel("<html>Your donation is more than just a monetary gift;\n"
                         + "a beacon of hope illuminating lives in need. With each donation,\n"
                         + "it's a lifeline for those in need. With each contribution, we create ripples of change,\n"
                         + "touching lives and building brighter futures.\n"
                         + "Together, let's turn compassion into action and transform the world one act of generosity at a time\n"
                         + "Thank you for your kindness, for believing in the power of giving,\n"
                         + "and for making a difference that truly matters.</html>");
        txt4.setBounds(80,350,800,300);
        txt4.setForeground(Color.BLACK);
        txt4.setFont(new Font("Santa Fe LET", Font.PLAIN,18));
        jp2.add(txt4);
        

        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==food1){
            Food foodFrame = new Food();
            foodFrame.setVisible(true);
           
            
        }else if(ae.getSource()==blood1){
            
            blood bloodFrame = new blood();
            bloodFrame.setVisible(true);
            
            
        }else if(ae.getSource()==cloth1){
             Cloth bloodFrame = new Cloth();
            bloodFrame.setVisible(true);
               
        }else{
            
            int responece = JOptionPane.showConfirmDialog(this, "Do you want to logout ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(responece==JOptionPane.YES_OPTION){
            new Home();
            setVisible(false);
            }else{
                
            }
            
        }
    }
    
    public static void main(String[] args) {
        
        new main();
    }
    
}
