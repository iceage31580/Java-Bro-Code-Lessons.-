import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame(); 
	JButton myButton = new JButton("New Window"); 
	
	LaunchPage(){
		
		myButton.setBounds(100, 160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420); 
		frame.setLayout(null); //6:58:55
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==myButton)
		{
			frame.dispose(); //it gets rid of the original launch page, and launches a new one
			NewWindow myWindow = new NewWindow(); 
		}
 }
}


	

