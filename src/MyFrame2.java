import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font; 


public class MyFrame2 extends JFrame implements ActionListener{
	
	JButton button; 
	JLabel label; 
	
		MyFrame2(){
			
			ImageIcon icon = new ImageIcon("point.png"); 
			ImageIcon icon2 = new ImageIcon("face.png"); 
			
			label = new JLabel(); 
			label.setIcon(icon2);
			label.setBounds(150, 250, 150, 150);
			label.setVisible(false); 
			
			new JButton();
			button.setBounds(200,100,250,100);
			button.setText("I'm a button");
			button.setFocusable(false);
			button.setIcon(icon);
			button.setHorizontalTextPosition(JButton.CENTER);
			button.setVerticalTextPosition(JButton.BOTTOM);
			button.setFont(new Font("Comic sans", Font.BOLD,25));
			button.setIconTextGap(-15);
			button.setForeground(Color.cyan);
			button.setBackground(Color.lightGray);
			button.setBorder(BorderFactory.createEtchedBorder());
			
			
			button.addActionListener(this); //button.addActionListener(e -> System.out.println("poo"); this is a lambda expression 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			this.setLayout(null);
			this.setSize(500,500);
			this.setVisible(true);
			this.add(button); 
			this.add(label); 
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button); 
			System.out.println("poo");
			
			button.setEnabled(false);
			label.setVisible(true);
		}
}



