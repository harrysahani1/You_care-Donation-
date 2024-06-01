
package donation;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,forget;
    JTextField txt,txt1;
    Login(){
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/login1.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1800, 1000, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,1800,1000);
        add(img);
        
        JLabel user = new JLabel("USERNAME  :- ");
        user.setBounds(550,250,300,30);
        user.setFont(new Font("ARIAL", Font.BOLD,15));
        img.add(user);
        
        txt = new JTextField();
        txt.setBounds(700,250,200,30);
        txt.setBorder(BorderFactory.createEmptyBorder());
        txt.setCursor(new Cursor(HAND_CURSOR));
        img.add(txt);
        
        
        JLabel pass = new JLabel("PASSWORD  :- ");
        pass.setBounds(550,290,300,30);
        pass.setFont(new Font("ARIAL", Font.BOLD,15));
        img.add(pass);
        
        txt1 = new JTextField();
        txt1.setBounds(700,290,200,30);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        txt1.setCursor(new Cursor(HAND_CURSOR));
        img.add(txt1);
        
        
        ImageIcon feed = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\enter.png");
        login = new JButton("Login", feed);
        login.setBounds(600,350,100,30);
        login.setBackground(new Color(133,145,170));
        login.setForeground(Color.white);
        login.setFont(new Font("ARIAL", Font.BOLD,12));
        login.setBorder(new LineBorder(new Color(133,145,170)));
        login.setCursor(new Cursor(HAND_CURSOR));
        login.addActionListener(this);
        img.add(login);
        
        
        ImageIcon sign = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\add-friend.png");        
        signup = new JButton("Signup", sign);
        signup.setBounds(750,350,100,30);
        signup.setBackground(new Color(133,145,170));
        signup.setForeground(Color.white);
        signup.setFont(new Font("ARIAL", Font.BOLD,12));
        signup.setBorder(new LineBorder(new Color(133,145,170)));
        signup.setCursor(new Cursor(HAND_CURSOR));
        signup.addActionListener(this);
        img.add(signup);
        
        ImageIcon get = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Donation\\src\\image\\confusion.png");
        forget = new JButton("Forget Password", get);
        forget.setBounds(670,400,150,35);
        forget.setBackground(new Color(133,148,170));
        forget.setForeground(Color.white);
        forget.setFont(new Font("ARIAL", Font.BOLD,12));
        forget.setBorder(new LineBorder(new Color(133,145,170)));
        forget.setCursor(new Cursor(HAND_CURSOR));
        forget.addActionListener(this);
        img.add(forget); 
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== login){
            try {
                String username = txt.getText();
                String password = txt1.getText();
                
               String query ="Select * from signup where password = '"+password+"' AND user = '"+username+"' ";
               Conn c= new Conn();
               ResultSet rs = c.st.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Loading("");
               }else{
                   JOptionPane.showMessageDialog(null, "Username or password is incorrect");
               }
               
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==signup){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
            new ForgetPassword();
        }
        
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
