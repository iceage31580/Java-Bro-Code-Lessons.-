import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*; 

public class MyFrame15 extends JFrame{

	MyPanel2 panel; 
	
	MyFrame15()
	{
		panel = new MyPanel2(); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.add(panel); 
		this.pack(); 
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
