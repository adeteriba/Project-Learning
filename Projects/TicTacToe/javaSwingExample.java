package Projects.ticTacToe;

import javax.swing.*;
import java.awt.event.*;

public class javaSwingExample {
    public static void main(String [] args){
        /*  
            JFrame f  = new JFrame();  // Create instance of JFrame

            JButton b = new JButton("click"); // Create instance of JButton
            b.setBounds(130, 100, 100, 40);

            f.add(b); //adding button in Jframe
            f.setSize(400, 500);
            f.setLayout(null); // Using no layout managers
            f.setVisible(true); // Make frame Visible */

        // Java JButton Example with ActionListener
        JFrame f1 = new JFrame("Button Example");

        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);

        JButton b1 = new JButton("Click Here");
        b1.setBounds(50, 100, 95, 30);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Text Field");
            }
        });

        f1.add(b1); f1.add(tf);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    
}
