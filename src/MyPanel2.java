import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;

public class MyPanel2 extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500; 
	final int PANEL_HEIGHT = 500; 
	Image enemy;
	Image backgroundImage; 
	Timer timer; 
	int xVelocity =2; 
	int yVelocity =1; 
	int x = 0; 
	int y = 0; 
	

	MyPanel2()
	{
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT)); 
		this.setBackground(Color.black);
		enemy = new ImageIcon("enemy.png").getImage();
		backgroundImage = new ImageIcon("space.png").getImage(); 
		timer = new Timer(); 
	}

	public void paint(Graphics g)
	{
		super.paint(g); //paint background 
		
		Graphics2D g2d =  (Graphics2D) g;
		
		g2d.drawImage(backgroundImage, 0, 0, null);
		g2d.drawImage(enemy, x, y, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0)
		{
			xVelocity = xVelocity * -1; 
		}
		
		x = x + xVelocity; //10:07:47
		
		if(y>=PANEL_HEIGHT-enemy.getWidth(null) || y<0)
		{
			yVelocity = yVelocity * -1; 
		}
		
		y = y + yVelocity;
		
		repaint(); 
		
		
	}
}
