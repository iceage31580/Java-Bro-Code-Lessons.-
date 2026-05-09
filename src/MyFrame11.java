import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame11 extends JFrame implements MouseListener{
	
	JLabel label; 
	ImageIcon smile; 
	ImageIcon nervous; 
	ImageIcon pain; 
	ImageIcon dizzy; 
	
		MyFrame11()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(500,500);
			this.setLayout(new FlowLayout());
			
			label = new JLabel(); 
			//label.setBounds(0,0, 100,100);
			//label.setBackground(Color.red);
			//label.setOpaque(true); 
			label.addMouseListener(this);
			
			
			smile = new ImageIcon("Smile.png"); 
			nervous = new ImageIcon("Nervous.png");
			pain = new ImageIcon("Pain.png");
			dizzy = new ImageIcon("Dizzy.png");
			
			label.setIcon(smile); 
			
			this.pack(); 
			this.setLocationRelativeTo(null); 
			this.setVisible(true);
			
			
			
			this.add(label); 
			this.setVisible(true); 
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			//Invoked when the mouse button has been clicked (pressed and released) on a component 
			System.out.println("You clicked the mouse");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			//Invoked when a mouse button has been pressed on a component (hold down the mouse) 
			System.out.println("You pressed the mouse"); 
			//label.setBackground(Color.yellow);
			label.setIcon(pain);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//Invoked when a mouse button has been released on a component 
			System.out.println("You released the mouse"); 
			//label.setBackground(Color.green);
			label.setIcon(dizzy);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			//Invoked when the mouse exits a component 
			System.out.println("You entered the component"); 
			//label.setBackground(Color.blue);
			label.setIcon(nervous);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("You exited the component");
			label.setBackground(Color.red);
		}
}
