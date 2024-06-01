/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FoodOrderApp extends JFrame {
    private JLabel statusLabel;
    private JButton checkStatusButton;
    private JTextField distanceField; 
    private int distance; 

    public FoodOrderApp() {
        super("Food Order App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500); 
        
        // Initialize components
        statusLabel = new JLabel("Order Status: ");
        checkStatusButton = new JButton("Check Status");
        checkStatusButton.setPreferredSize(new Dimension(150, 30)); 
        checkStatusButton.setBackground(Color.BLUE); 
        checkStatusButton.setForeground(Color.WHITE); 
        distanceField = new JTextField();
        
        // Add action listener to the button
        checkStatusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                try {
                    distance = Integer.parseInt(distanceField.getText());
                    
                    updateStatus();
                } catch (NumberFormatException ex) {
                    
                    JOptionPane.showMessageDialog(FoodOrderApp.this, "Please enter a valid distance in kilometers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
       
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(new JLabel("Enter your location distance from Delhi (in km):"));
        panel.add(distanceField);
        panel.add(checkStatusButton);
        panel.add(statusLabel);
        add(panel);
        
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    
    private void updateStatus() {
        if (distance >= 5 && distance < 20) {
            statusLabel.setText("Order Status: Reached in 30 minutes");
        } else if (distance >= 20 && distance <= 60) {
            statusLabel.setText("Order Status: Reached in 60 minutes");
        }else if (distance >= 60 && distance <= 80) {
            statusLabel.setText("Order Status: Reached in 120 minutes");
        }
        else {
            statusLabel.setText("Order Status: Distance out of range");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FoodOrderApp();
            }
        });
    }
}

