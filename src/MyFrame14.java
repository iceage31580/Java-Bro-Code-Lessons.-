import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*; 

public class MyFrame14 extends JFrame{
	
	MyPanel panel; 
	
	MyFrame14(){
	
	panel = new MyPanel(); 
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	//this.setSize(500,500);
	
	this.add(panel); 
	this.pack(); 
	this.setLocationRelativeTo(null);
	this.setVisible(true); 
	
	}
	
	
}
