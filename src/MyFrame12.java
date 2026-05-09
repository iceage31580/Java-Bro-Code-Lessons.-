import javax.swing.JFrame;

public class MyFrame12 extends JFrame{
	
	DragPanel dragPanel = new DragPanel(); 
		
	MyFrame12()
		{
			this.add(dragPanel); 
			this.setTitle("Drag & Drop Demo");
			this.setSize(600,600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
		}
}
