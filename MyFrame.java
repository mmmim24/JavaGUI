package JavaGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame{

    MyFrame(){
        JFrame frame = new JFrame();

        frame.setTitle("Sample Frame"); // sets title on top of  the frame
        frame.setSize(360,360); // sets width and height
        // frame.setResizable(false); // prevent frame from being resized
        frame.setVisible(true); //make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out application and java process background

        ImageIcon img = new ImageIcon("sun.png"); //creates an imaegIcon object
        frame.setIconImage(img.getImage()); //change the icon of the frame

        frame.getContentPane().setBackground(new Color(234,0,234)); // changes the color of the background
        frame.getContentPane().setBackground(new Color(0x123456)); // changes the color of the background in hexadecimal

    }   
}
